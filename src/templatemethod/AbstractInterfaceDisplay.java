package templatemethod;

public interface AbstractInterfaceDisplay {

    default void open() {

    }

    default void print() {

    }

    default void close() {

    }

      default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
