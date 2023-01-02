package prototype;

import prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
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
        Product product = null;

        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
