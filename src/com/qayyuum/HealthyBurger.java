package com.qayyuum;

public class HealthyBurger extends Hamburger {
    private String addItemHealthy1;
    private double addItemHealthyPrice1;

    private String addItemHealthy2;
    private double addItemHealthyPrice2;

    public HealthyBurger(String meat, double price) {
        super("Brown Rye Roll", meat, "Healthy", price);
    }

    @Override
    public double calcHamburgerPrice() {
        double basePrice = super.calcHamburgerPrice();

        if (this.addItemHealthy1 != null) {
            basePrice += this.addItemHealthyPrice1;
            System.out.println("Added " + this.addItemHealthy1 + " for an extra " + this.addItemHealthyPrice1);
        }
        if (this.addItemHealthy2 != null) {
            basePrice += this.addItemHealthyPrice2;
            System.out.println("Added " + this.addItemHealthy2 + " for an extra " + this.addItemHealthyPrice2);
        }

        return basePrice;
    }

    public void addHealthyItem1(String addItem1, double price) {
        this.addItemHealthy1 = addItem1;
        this.addItemHealthyPrice1 = price;
    }

    public void addHealthyItem2(String addItem1, double price) {
        this.addItemHealthy2 = addItem1;
        this.addItemHealthyPrice2 = price;
    }
}
