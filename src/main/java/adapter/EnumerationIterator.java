package adapter;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;

public class EnumerationIterator implements Iterator<Objects> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Objects next() {
        return (Objects) enumeration.nextElement();
    }
    public void remove(){
        throw  new UnsupportedOperationException();
    }
}
