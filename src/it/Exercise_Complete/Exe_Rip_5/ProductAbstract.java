package it.Exercise_Complete.Exe_Rip_5;

abstract class ProductAbstract extends Items implements Sale {
    private int id;
    private String description;
    private ProductType tipoProdotto;
    private double sale;

    public ProductAbstract(String name, double value, int id, String description, ProductType tipoProdotto, double sale) {
        super(name, value);
        this.id = id;
        this.description = description;
        this.tipoProdotto = tipoProdotto;
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public ProductType getProductType() {
        return tipoProdotto;
    }

    public double getSale() {
        return sale;
    }
   @Override
    public void applySale(double sale) {
        this.sale = sale;
   }
   @Override
    public double calculateDiscountedPrice(double price){
        return price * (1 - sale / 100);
   }
}
