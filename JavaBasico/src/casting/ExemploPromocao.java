package casting;

public class ExemploPromocao {
    public static void main(String[] args) {
        int int_ = 150;
        double double_ = 150.5;
        System.out.println(int_ + double_);
        System.out.println((int) (int_ + double_));
        System.out.println(somar(int_, double_));
    }
    
    public static double somar(double parcela1, double parcela2) {
        return parcela1 + parcela2;
    }
}
