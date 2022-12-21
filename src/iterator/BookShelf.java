package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book>{

    private List<Book> books;


    public BookShelf(int lastSize) {
        this.books = new ArrayList<>(lastSize);
    }


    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBooks(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);

    }

}
