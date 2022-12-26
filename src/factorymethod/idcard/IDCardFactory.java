package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory {

    private int serialNumber = 100;
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serialNumber++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product +"을 등록했습니다.");
    }
}
