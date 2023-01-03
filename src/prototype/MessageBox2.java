package prototype;

import prototype.framework.ConcreteProduct;
import prototype.framework.Product;
import prototype.framework.Product2;

public class MessageBox2 extends ConcreteProduct {
    private char decochar;

    public MessageBox2(char decochar) {
        this.decochar = decochar;
    }

    public MessageBox2(MessageBox2 protoType) {
        this.decochar = protoType.decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();

        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new MessageBox2(this);
    }
}
