package exercicios.exercicioExtra1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("1", 2000);
        ContaPoupanca cp = new ContaPoupanca("2", 1000);
        
        System.out.println(cc.sacar(2200, true));
        System.out.println(cp.sacar(2000));
        
        System.out.println(cc.depositar(5));
        System.out.println(cc.extrato());
        System.out.println(cc.verificarLimiteChequeEspecial());
    }
}
