package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
//        Display b1 = new StringDisplay("Hello World");
//        Display b2 = new UpdownBorder(b1, '#');
//        Display b3 = new FullBorder(b2);
//        b1.show();
//        b2.show();
//        b3.show();
//
//        Display b4 = new SideBorder(
//                new FullBorder(
//                        new FullBorder(
//                                new SideBorder(
//                                        new StringDisplay("Hello, world"),
//                                        '*')
//                        )
//                ),
//
//                '/');
//
//        b4.show();

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("hi");
        md.add("Good moring");
        md.add("Good night");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
