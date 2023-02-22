package imports;

import java.util.Scanner;
import java.util.Random;

import statics.Carro;

public class ExemploImport1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println(Carro.getFinalDefinicao());
        Carro carro = Carro.criar("Volkswagen", 4);
    }
}
