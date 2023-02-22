package primitivosEReferencias;

import java.awt.Point;
import java.util.Arrays;

public class ExemploPrimitivosEReferencias {
    public static void main(String[] args) {
        int Int = 0;
        System.out.println(String.format("int (primitivo): %d", Int));
        
        float Float = 0.222f;
        System.out.println(String.format("float (primitivo): %.2f", Float));
        
        
        char Char = 'c';
        changePrimitive(Char);
        System.out.println(String.format("char (primitivo) antes de mudar: %s", Char));
        changePrimitive(Char);
        System.out.println(String.format("char (primitivo) depois de mudar: %s", Char));
        
        boolean Boolean = false;
        System.out.println(String.format("boolean (primitivo): %b", Boolean));
        
        String string = "Johnny John";
        System.out.println(String.format("string (objeto) antes de mudar, sem atribuição: %s", string));
        changeObject(string);
        System.out.println(String.format("string (objeto) depois de mudar, sem atribuição: %s", string));
        string = changeObject(string);
        System.out.println(String.format("string (objeto) depois de mudar, com atribuição: %s", string));
        
        int[] IntArray = {};
        System.out.println(String.format("arranjo (objeto) de inteiros: %s", Arrays.toString(IntArray)));
        
        Point point = new Point(1, 1);
        System.out.println(String.format("point (objeto) antes de mudar: %s", point));
        changeObject(point);
        System.out.println(String.format("point (objeto) depois de mudar: %s", point));
        
        // Cópia de valor
        int val1 = 5;
        int val2 = val1;
        
        // Cópia de referência
        Point point1 = new Point(1, 1);
        Point point2 = point1;
    }
    
    public static void changePrimitive(char value) {
        value = 'Y';
    }
    
    public static void changeObject(Point value) {
        value.x = 2;
        value.y = 2;
    }
    
    public static String changeObject(String value) {
        //return "John Johnny";
        return value.concat(" Jones");
    }
    
    public static void changeObject(StringBuilder value) {
        value.append(" Jones");
    }
}
