package com.qayyuum;


public class Hamburger {
    private String breadRollType;
    private String meat;
    private String name;
    private double price;

    private String addItem1;
    private double addItem1Price;

    private String addItem2;
    private double addItem2Price;

    private String addItem3;
    private double addItem3Price;

    private String addItem4;
    private double addItem4Price;

    public Hamburger(String breadRollType, String meat, String name, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }

    public void addItemTo1(String addItem1, double price) {
        this.addItem1 = addItem1;
        this.addItem1Price = price;
    }

    public void addItemTo2(String addItem1, double price) {
        this.addItem2 = addItem1;
        this.addItem2Price = price;
    }

    public void addItemTo3(String addItem1, double price) {
        this.addItem3 = addItem1;
        this.addItem3Price = price;
    }

    public void addItemTo4(String addItem1, double price) {
        this.addItem4 = addItem1;
        this.addItem4Price = price;
    }

    public double calcHamburgerPrice() {
        double price = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + "roll"
                + " price is " + this.price);

        if (this.addItem1 != null) {
            price += this.addItem1Price;
            System.out.println("Added " + this.addItem1 + " for an extra " + this.addItem1Price);
        }
        if (this.addItem2 != null) {
            price += this.addItem2Price;
            System.out.println("Added " + this.addItem2 + " for an extra " + this.addItem2Price);
        }
        if (this.addItem3 != null) {
            price += this.addItem3Price;
            System.out.println("Added " + this.addItem3 + " for an extra " + this.addItem3Price);
        }
        if (this.addItem4 != null) {
            price += this.addItem4Price;
            System.out.println("Added " + this.addItem4 + " for an extra " + this.addItem4Price);
        }
        return price;
    }
}
