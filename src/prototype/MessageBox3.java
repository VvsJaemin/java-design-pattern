package prototype;

import prototype.framework.ProductCl;

public class MessageBox3 extends ProductCl {
    private char decochar;

    public MessageBox3(char decochar) {
        this.decochar = decochar;
    }

    public MessageBox3(MessageBox3 protoType) {
        this.decochar = protoType.decochar;
    }

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

    public ProductCl createCopy() {
        return new MessageBox3(this);
    }
}
