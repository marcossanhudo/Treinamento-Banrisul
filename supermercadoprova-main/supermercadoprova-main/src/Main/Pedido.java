package Main;

import Utils.Inputs;

import java.util.ArrayList;

public class Pedido {

    private static ArrayList<Item> listaDeItens = new ArrayList();
    private static double valorTotalDoPedido = 0;

    public static void calculaValorTotal() {
        double subTotal = 0;
        for (Item item : listaDeItens) {
            subTotal += item.getValorDoItem();
        }
        valorTotalDoPedido = subTotal;
    }

    public static boolean adicionaItemNaLista(Produto produto, int quantidade) {
        if (Estoque.getQuantidadeAtualEmEstoque(produto) >= quantidade) {
            
            for (Item item : listaDeItens) {
                if (item.getProduto().getNome().equalsIgnoreCase(produto.getNome())) {
                    Estoque.darBaixaEmEstoque(item.getProduto().getId(), quantidade);
                    item.setQuantidade(item.getQuantidade() + quantidade);
                    item.defineValorTotal();
                    System.out.println("Foi adicionada a quantidade ao item j√° existente.");
                    return false;
                }
            }
        
            listaDeItens.add(new Item(produto, quantidade));
            Estoque.darBaixaEmEstoque(produto.getId(), quantidade);
            System.out.println("Foi adicionado o produto na lista de compras.");
            return true;
            
        } else {
            System.out.println("N„o h· estoque suficiente. O item n„o foi adicionado ‡ lista de compras.");
            return false;
        }
    }

    public static void imprimePedido() {
        System.out.println("                              NOTA FISCAL");
        System.out.printf("ID       |NOME            |PRECO UN           |QUANTIDADE   |PRECO ITEM \n");
        for (Item item : listaDeItens) {
            System.out.printf("%-8d | %-14s | R$%-15.2f | %-10d  | R$%.2f\n"
                    , item.getProduto().getId(), item.getProduto().getNome(), item.getProduto().getPreco(), item.getQuantidade(), item.getValorDoItem());
        }
        imprimeValorTotal();
    }

    private static void imprimeValorTotal() {
        System.out.println();
        System.out.printf("Total: R$%.2f", valorTotalDoPedido);
        System.out.println("________________________________________________________________________");
        System.out.println();
        System.out.println();
    }

    public static void adicionaItem(){
        String nome = recebeNomeDoTeclado();
        int quantidade = recebeQuantidadeDoTeclado();
        Produto produto = Estoque.encontraProduto(nome);
        if(produto != null){
            adicionaItemNaLista(produto,quantidade);
            calculaValorTotal();
        } else {
            System.out.println("Produto nao encontrado");
        }

    }

    public static String recebeNomeDoTeclado(){
        System.out.print("Digite o nome: ");
        return Inputs.inputString();
    }


    public static int recebeQuantidadeDoTeclado(){
        System.out.print("Digite a quantidade: ");
        return Inputs.inputInt();
    }

    public void limparCarrinho() {
        listaDeItens.clear();
    }

    public static ArrayList<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(ArrayList<Item> listaDeItens) {
        Pedido.listaDeItens = listaDeItens;
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPedido(double valorTotalDoPedido) {
        Pedido.valorTotalDoPedido = valorTotalDoPedido;
    }
    
    public static void finalizaPedido() {
        System.out.printf("QUANTIA A PAGAR: R$%-15.2f\n", valorTotalDoPedido);
        System.out.println("QUANTIA DE PAGAMENTO: ");
        double pagamento = Inputs.inputDouble();
        while (valorTotalDoPedido > pagamento) {
            System.out.println("QUANTIA INSUFICIENTE.");
            System.out.println("QUANTIA A PAGAR: " + valorTotalDoPedido);
            System.out.println("1 - INSERIR OUTRA QUANTIA");
            System.out.println("0 - VOLTAR ¿ EDI«√O DE PEDIDOS");
            System.out.println("ESCOLHA UMA OP√á√ÉO: ");
            
            int escolha = Inputs.inputInt();
            if (escolha == 0) return;
            if (escolha == 1) {
                System.out.println("INSIRA A NOVA QUANTIDADE: ");
                pagamento = Inputs.inputDouble();
            }
        }

        System.out.println("QUANTIA SUFICIENTE.");
        
        double troco = pagamento - valorTotalDoPedido;
        System.out.printf("TROCO: R$%-15.2f\n", troco);
        if (troco > 0) imprimirCombinacaoNotas(troco);
        System.out.println("PEDIDO ENCERRADO.");
    }
    
    public static void imprimirCombinacaoNotas(double troco) {
        double[] notasPossiveis =
            //{ 100, 50, 20, 11, 5, 1, 0.50, 0.25, 0.10, 0.05, 0.01 }; // NOTAS ALTERNATIVAS PARA TESTES
            { 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
        
        System.out.println("TROCO MAIS EFICIENTE");
        
        /* DESCARTADO -- N√O GARANTE MELHOR TROCO DADO QUALQUER GRUPO DE NOTAS
         * for (int indice = 0; indice < notasPossiveis.length; indice++) {
            while (troco >= notasPossiveis[indice]) {
                quantiasDeCadaNota[indice] = (int) (troco / notasPossiveis[indice]);
                troco %= notasPossiveis[indice];
            }
            if (quantiasDeCadaNota[indice] > 0)
                System.out.printf("%d notasPossiveis/moedas de R$%-15.2f\n", quantiasDeCadaNota[indice], notasPossiveis[indice]);
        }*/
        
        int menorQuantiaTotalEncontrada = 0;
        int[] menoresQuantiasPossiveisParaCadaNota = new int[notasPossiveis.length];
        
        for (int iteracao = 0; iteracao < notasPossiveis.length; iteracao++) {
            double copiaDoTroco = troco;
            int[] quantiasDeCadaNota = new int[notasPossiveis.length];
            int quantiaTotalEncontrada = 0;
            
            for (int indice = iteracao; indice < notasPossiveis.length; indice++) {
                quantiasDeCadaNota[indice] = (int) (copiaDoTroco / notasPossiveis[indice]);
                copiaDoTroco %= notasPossiveis[indice];
                
                quantiaTotalEncontrada += quantiasDeCadaNota[indice];
            }
            
            if (quantiaTotalEncontrada < menorQuantiaTotalEncontrada
                    || menorQuantiaTotalEncontrada == 0) {
                menorQuantiaTotalEncontrada = quantiaTotalEncontrada;
                menoresQuantiasPossiveisParaCadaNota = quantiasDeCadaNota;
            }
        }
        
        for (int indice = 0; indice < notasPossiveis.length; indice++)
            if (menoresQuantiasPossiveisParaCadaNota[indice] > 0)
                System.out.printf("%d notas/moedas de R$%-15.2f\n", menoresQuantiasPossiveisParaCadaNota[indice], notasPossiveis[indice]);
        
    }
}
