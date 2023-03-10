package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);// 책장 사이즈 5
        bookShelf.appendBooks(new Book("SQLD 수험서"));
        bookShelf.appendBooks(new Book("디자인 패턴 책"));
        bookShelf.appendBooks(new Book("카프카 책"));
        bookShelf.appendBooks(new Book("카프카 2"));
        bookShelf.appendBooks(new Book("카프카 2"));
        bookShelf.appendBooks(new Book("카프카 2"));
        bookShelf.appendBooks(new Book("카프카 2"));

        //명시적으로 Iterator를 사용하는 방법
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();// CurrwnrElementAndAdvanceNextPosition의 뜻
            System.out.println("book.getName() = " + book.getName());
        }
        System.out.println();


        //for
        for (int i = 0; i < bookShelf.getLength(); i++) {
            Book bookAt = bookShelf.getBookAt(i);
            System.out.println("bookAt = " + bookAt.getName());
        }


    }
}
