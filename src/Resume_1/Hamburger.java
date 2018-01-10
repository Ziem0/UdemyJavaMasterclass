package Resume_1;


import java.util.ArrayList;

public class Hamburger {
    private String name;
    private double price;
    private String breadRoll;
    private String meat;
    private ArrayList<Addition> additions = new ArrayList<Addition>();
    private int maxAdditions;

    public Hamburger(String name, double price, String breadRoll, String meat, int maxAdditions) {
        this.name = name;
        this.price = price;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.maxAdditions = maxAdditions;
    }

    private void sumPrice() {
        if (additions != null) {
            for (Addition i : additions) {
                this.price += i.getPrice();
            }
        }
    }

    private boolean checkAddsLimit() {
        if (additions.size() == maxAdditions) {
            System.out.println("You cannot add more addon. Limit is " + maxAdditions);
            return false;
        }
        return true;
    }


    public void addAddition(String name, double price) {
        boolean process = checkAddsLimit();
        if (process) {
            Addition addon = new Addition(name, price);
            additions.add(addon);
            sumPrice();
        }
    }

    public String toString() {
        return "This is a hamburger " + this.name + "\n" + "Ingredients:\n"+additions.toString()+"\nPrice final " + this.price;
    }
}
