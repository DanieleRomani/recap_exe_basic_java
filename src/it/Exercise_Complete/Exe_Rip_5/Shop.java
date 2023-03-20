package it.Exercise_Complete.Exe_Rip_5;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private String name;
    private Map<String, ProductAbstract> catalog;

    public Shop(String name, Map<String, Items> catalog) {
        this.name = name;
        this.catalog = new HashMap<String, ProductAbstract>();
    }
    public void addProductType(ProductAbstract product) {
        this.catalog.put(product.getDescription(), product);
    }
    public void removeProductType(String description) {
        this.catalog.remove(description);
    }
   public ProductAbstract getItems(String description) {
        return this.catalog.get(description);
   }
   public void applySale(ProductAbstract product, double sale) {
        for (ProductAbstract productAbstract : this.catalog.values()) {
            if (productAbstract.getProductAbstract() == product) {
                productAbstract.applySale(sale);
            }
        }
   }
}
