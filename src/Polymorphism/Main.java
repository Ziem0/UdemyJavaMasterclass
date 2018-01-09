package Polymorphism;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {

        return doors;
    }

    public String startEngine() {
        return getClass().getSimpleName()+" Engine is on";
    }

    public String accelerate() {
        return getClass().getSimpleName()+" Wruuum";
    }

    public String brake() {
        return getClass().getSimpleName()+" Brrr";
    }
}

class Maluch extends Car {
    public Maluch(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Peugeot extends Car {
    public Peugeot(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        getClass().getSimpleName();
        return getName() + " is on";
    }

    @Override
    public String accelerate() {
        return getName()+" Wruuum";
    }

    @Override
    public String brake() {
        return getName()+" Brrr";
    }
}

public class Main {
    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generic car class.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    public static void main(String[] args) {
        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Maluch maluch= new Maluch("Maluch", 4);
        System.out.println(maluch.startEngine());
        System.out.println(maluch.accelerate());
        System.out.println(maluch.brake());

        Peugeot peugeot = new Peugeot("Peugeot", 4);
        System.out.println(peugeot.startEngine());
        System.out.println(peugeot.accelerate());
        System.out.println(peugeot.brake());

    }
}
