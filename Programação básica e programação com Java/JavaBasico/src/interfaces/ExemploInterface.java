package interfaces;

public class ExemploInterface {
    public static void main(String[] args) {
        calcularSalario(new Coordenador());
        calcularSalario(new Operador());
        calcularSalario(new Gerente());
        calcularSalario(new RH());
    }
    
    public static double calcularSalario(Funcionario funcionario) {
        return funcionario.calcularSalario();
    }
    
    public static void darBomDiaAosColegas(Funcionario funcionario) {
        funcionario.cumprimentarPessoas();
    }
     
}
