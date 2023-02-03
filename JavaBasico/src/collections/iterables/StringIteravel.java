package collections.iterables;

import java.util.Iterator;

public class StringIteravel implements Iterable<String> {
    private String[] sourceInterno;
    
    public StringIteravel(String valor) {
        this.sourceInterno = valor.trim()
                                .replace(" ", "")
                                .split(",");
    }
    
    @Override
    public Iterator<String> iterator(){
        return new StringIterador(sourceInterno);
    }
}
