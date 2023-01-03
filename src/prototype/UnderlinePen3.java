package prototype;

import prototype.framework.ProductCl;

public class UnderlinePen3 extends ProductCl {
    private char ulChar;

    public UnderlinePen3(char ulChar) {
        this.ulChar = ulChar;
    }

    public UnderlinePen3(UnderlinePen3 prototype) {
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
    public ProductCl createCopy() {
        return new UnderlinePen3(this);

    }
}
