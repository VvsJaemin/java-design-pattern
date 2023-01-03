package prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();
    private Map<String, ProductCl> showcase2 = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }
    public void register2(String name, ProductCl prototype) {
        showcase2.put(name, prototype);
    }


    public Product create(String prototypeName) {
        Product product = showcase.get(prototypeName);
        return product.createCopy();
    }

    public ProductCl create2(String prototypeName) {
        ProductCl product = showcase2.get(prototypeName);
        return product.createCopy();
    }
}
