package allInOne;

public class Fish extends Animal {
    private int fins;
    private int eyes;
    private int gills;

    public Fish(String name, int size, int weight, int fins, int eyes, int gills) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.eyes = eyes;
        this.gills = gills;
    }

    private void rest() {
        System.out.println("Fish RIP");
    }

    private void moveMuscles() {
        System.out.println("moveMuscles() called");
    }
    private void moveBacFin() {
        System.out.println("moveBackFin() called");
    }

    private void swim(int speed) {
        moveMuscles();
        moveBacFin();
        super.move(speed);
    }
}
