package it.Exercise_Complete.Exe_Rip_5;

public enum ProductType extends Items {
    ELECTRONICS("Product electronics","Electronics"),
    FOOD("FreshFood","Food"),
    CLOTHING("Summer clothing","Winter clothing");
    private final String name;
    private final String description;

    ProductType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
