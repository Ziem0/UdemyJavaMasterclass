package Resume_1;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("deluxe", 10, "mixed", "pork", 2);
        addAddition("cola",3.00);
        addAddition("chips",2.20);
    }

    @Override
    public void addAddition(String name, double price) {
        super.addAddition(name, price);
    }
}
