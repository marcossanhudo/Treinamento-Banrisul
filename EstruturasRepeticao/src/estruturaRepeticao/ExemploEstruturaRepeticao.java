package estruturaRepeticao;

public class ExemploEstruturaRepeticao {
    public static void main(String[] args) {
        // while
        int numero1 = 1;
        while (numero1 <= 10) {
            System.out.println(numero1++);
        }
        System.out.println("Fim do fluxo 1");
        
        boolean condicao1 = true;
        while (condicao1) {
            System.out.println(condicao1);
            condicao1 = false;
        }
        System.out.println("Fim do fluxo 2");
        
        // do-while
        int numero2 = 1;
        do {
            System.out.println(numero2++);
        } while (numero2 <= 10);
        System.out.println("Fim do fluxo 3");
        
        boolean condicao2 = true;
        do {
            System.out.println(condicao2);
            condicao2 = false;
        } while (condicao2);
        System.out.println("Fim do fluxo 4");
        
        // for
        for (int numero3 = 1; numero3 <= 10; numero3++) {
            System.out.println(numero3);
        }
        System.out.println("Fim do fluxo 5");
    }
}
