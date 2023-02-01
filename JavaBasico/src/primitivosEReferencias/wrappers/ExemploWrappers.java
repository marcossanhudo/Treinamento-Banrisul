package primitivosEReferencias.wrappers;

public class ExemploWrappers {
    public static void main(String[] args) {
        
        // Wrappers têm boxing implícito
        int primInt = 0;
        System.out.println("int primitivo: " + primInt);
        Integer wrapInt = 0;
        System.out.println("int wrapper: " + wrapInt);
        
        float primFloat = 0.0f;
        System.out.println("float primitivo: " + primFloat);
        Float wrapFloat = 0.0f;
        System.out.println("float wrapper: " + wrapFloat);
        
        char primChar = 'a';
        System.out.println("char primitivo: " + primChar);
        Character wrapChar = 'a';
        System.out.println("char wrapper: " + wrapChar);
        
        boolean primBoolean = false;
        System.out.println("boolean primitivo: " + primBoolean);
        Boolean wrapBoolean = false;
        System.out.println("boolean wrapper: " + wrapBoolean);
        
        // Wrappers com boxing explícito
        Integer explicitlyBoxedInt = Integer.valueOf(16);
        
        // Unboxing
        int implicitlyUnboxedInt = explicitlyBoxedInt;
        int explicitlyUnboxedInt = explicitlyBoxedInt.intValue();
    }
}
