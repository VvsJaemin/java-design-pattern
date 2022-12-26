package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("jaemin1");
        Product card2 = factory.create("jaemin2");
        Product card3 = factory.create("jaemin3");

        card1.use();
        card2.use();
        card3.use();
    }
}
