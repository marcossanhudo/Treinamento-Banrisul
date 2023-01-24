package testeMain;

import java.time.LocalDate;

public class ExemploLogica {
    public static void main(String[] args) {
        // Grupo dos inteiros
        short intCurto = 9999;
        int intNormal = 999999999;
        long intLongo = 999999999;
        System.out.println(intCurto);
        System.out.println(intNormal);
        System.out.println(intLongo);
        
        // Grupo dos decimais
        float decFlutuante = 0.0f;
        float decFlutuante2 = (float) 0.0;
        double decDuplo = 0.0;
        System.out.println(decFlutuante);
        System.out.println(decFlutuante2);
        System.out.println(decDuplo);
        
        // Grupo dos textos
        char Y = 'Y';
        System.out.println(Y);
        String olaMundo = "Olá, Mundo!";
        System.out.println(olaMundo);
        
        // Grupo das datas
        LocalDate data = LocalDate.now();
        System.out.println(data);
    }
}
