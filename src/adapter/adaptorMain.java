package adapter;

public class adaptorMain {
    public static void main(String[] args) {

        Print p = new PrintBanner("hello");

        p.printWeak();
        p.printStrong();

    }
}
