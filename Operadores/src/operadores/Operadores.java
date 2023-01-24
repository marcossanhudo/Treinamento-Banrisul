package operadores;

public class Operadores {
    public static void main(String[] args) {
        
        // Operador de atribuição
        int numero1 = 2;
        System.out.println(numero1);
        
        int numero2 = 1;
        System.out.println(numero2);
        
        numero2 = numero1;
        System.out.println(numero2);
        
        // Operadores de aritmética
            // Soma
            int soma = 2 + 2;
            int soma2 = soma + 2;
            int soma3 = soma + soma2;
            System.out.println(soma3);
            
            String primeiroNome = "Renato";
            String sobrenome = "Chitolina";
            String nome = primeiroNome + " " + sobrenome;
            System.out.println(nome);
            
            // Subtração
            int sub = 10 - 5;
            int sub2 = sub - 2;
            int sub3 = sub - sub2;
            System.out.println(sub3);
            
            // Multiplicação
            int mult = 3 * 3;
            int mult2 = mult * 3;
            int mult3 = mult * mult2;
            System.out.println(mult3);
            
            // Divisão
            double div = 10.0 / 4.0;
            System.out.println(div);
            
            // Módulo
            double mod = 10.0 % 5.0;
            System.out.println(mod);
            
        // Operadores de incremento e decremento
        int contador = 1;
        contador++;
        System.out.println(contador++);
        System.out.println(++contador);
        System.out.println(contador--);
        System.out.println(--contador);
            
        // Operadores atalhos
        int numero3 = 1;
        numero3 += 5;
        System.out.println(numero3);
        int numero4 = 10;
        numero4 /= 5;
        System.out.println(numero4);
        
        // Operadores de comparação
            // Igualdade e diferença
            int numeroComp1 = 1;
            int numeroComp2 = 2;
            boolean comparacao1 = numeroComp1 == numeroComp2;
            System.out.println(comparacao1);
            numeroComp2--;
            System.out.println(numeroComp1 == numeroComp2);
            
            String stringComp1 = "azul";
            String stringComp2 = "amarelo";
            System.out.println(stringComp1 != stringComp2);
            
            // Relações
            int numeroComp3 = 2;
            int numeroComp4 = 7;
            boolean comparacao2 = numeroComp3 > numeroComp4;
            System.out.println(comparacao2);
            numeroComp3 += 5;
            System.out.println(numeroComp3 >= numeroComp4);
            
        // Operadores lógicos
            boolean expressao1 = true == false;
            boolean expressao2 = 5 >= 10;
            boolean expressao3 = "AB" != "CD";
            boolean expressaoCombinada = expressao1 && expressao2 && expressao3;
            System.out.println(expressaoCombinada);
            boolean expressaoCombinada2 = expressao1 || expressao2 || expressao3;
            System.out.println(expressaoCombinada2);
            System.out.println(expressaoCombinada && expressaoCombinada2);
            System.out.println(1 == 1 && (2 >= 5 || true == false));
            boolean expressao4 = !('A' != 'A');
            System.out.println(expressao4);
            System.out.println(!true);
    }
}
