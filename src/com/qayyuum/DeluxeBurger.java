package com.qayyuum;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String breadRollType, String meat, String name, double price) {
        super(breadRollType, meat, name, price);
        super.addItemTo1("drinks", 1.0d);
        super.addItemTo2("chips", 1.0d);
    }

    @Override
    public double calcHamburgerPrice() {
        double basePrice = super.calcHamburgerPrice();
        return basePrice;
    }
}
