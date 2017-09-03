package com.qayyuum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger myhamburger = new Hamburger("long bread", "schinken", "Vincent", 3.00d);
        myhamburger.addItemTo1("lettuce", 0.5d);
        myhamburger.addItemTo2("cheese", 1.00d);

        double hamburgerPrice = myhamburger.calcHamburgerPrice();
        System.out.println("Total price for hamburger ordered is "+ hamburgerPrice);

        DeluxeBurger mydeluxe = new DeluxeBurger("Wheat Roll", "Sausage", "Anne", 5.0d);
        double myDeluxePrice = mydeluxe.calcHamburgerPrice();
        System.out.println("Total price for deluxe hamburger ordered is "+ myDeluxePrice);

        HealthyBurger myhealthy = new HealthyBurger("Double Down", 6.11d);
        myhealthy.addHealthyItem1("Egg", 1.5d);
        myhealthy.addItemTo1("Lettuce", 1.0d);
        myhealthy.addItemTo2("Tomato",0.7d);
        double myHealthyPrice = myhealthy.calcHamburgerPrice();
        System.out.println("Total price for deluxe hamburger ordered is "+ myHealthyPrice);

    }
}
