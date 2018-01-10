package Resume_1;

import Resume_1.Addition;

import java.util.ArrayList;

public class Hamburger {
    private String name;
    private double price;
    private String breadRoll;
    private String meat;
    private ArrayList<Addition> additions = new ArrayList<Addition>();

    public Hamburger(String name, double price, String breadRoll, String meat) {
        this.name = name;
        this.price = price;
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    private void sumPrice() {
        if (additions != null) {
            for (Addition i : additions) {
                this.price += i.getPrice();
            }
        }
    }

    public void addAddition(String name, double price) {
        Addition addon = new Addition(name, price);
        additions.add(addon);
        sumPrice();
    }

    public String toString() {
        return "This is a hamburger " + this.name + "\n" + "Ingredients:\n"+additions.toString()+"\nPrice final " + this.price;
    }
}
