package iterator;

import java.util.Iterator;

public interface Iterable<E> {

    public abstract Iterator<E> iterator();
}
