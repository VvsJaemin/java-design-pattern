package prototype;

import prototype.framework.ConcreteProduct;
import prototype.framework.Product;

public class UnderlinePen2 extends ConcreteProduct {
    private char ulChar;

    public UnderlinePen2(char ulChar) {
        this.ulChar = ulChar;
    }

    public UnderlinePen2(UnderlinePen2 prototype) {
        this.ulChar = prototype.ulChar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new UnderlinePen2(this);

    }
}
