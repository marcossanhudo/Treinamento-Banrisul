package collections.iterables;

public class ExemploIterables {
    public static void main(String[] args) {
        StringIteravel stringIteravel = new StringIteravel("Ma��, Banana, Mam�o, Melancia");
        for (String string:  stringIteravel) {
            System.out.println(string);
        }
    }
}
