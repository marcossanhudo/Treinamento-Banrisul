package collections.iterables;

import java.util.Iterator;

public class StringIterador implements Iterator<String> {
    private String[] sourceInterno;
    private int index = 0;
    
    public StringIterador(String[] valores) {
        this.sourceInterno = valores;
    }
    
    @Override
    public boolean hasNext() {
        return index < this.sourceInterno.length;
    }
    
    @Override
    public String next() {
        return this.sourceInterno[index++];
    }
}
