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

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(3);   //execute Animal class method move()
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);   //first execute override method
    }

    private void startRun() {
        System.out.println("Starting run!");
    }

    @Override
    public void move(int speed) {
        startRun();
        super.move(speed);
    }
}
