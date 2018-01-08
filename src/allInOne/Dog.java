package allInOne;

public class Dog extends Animal {
    private int eyes;
    private int tail;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int tail, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
