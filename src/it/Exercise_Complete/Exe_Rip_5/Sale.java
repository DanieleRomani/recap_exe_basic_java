package it.Exercise_Complete.Exe_Rip_5;

public interface Sale {
    double sale = 0.0;
    void applySale(double percentageSale);
    double calculateDiscountedPrice(double price);

    void sale(double sale);
}
