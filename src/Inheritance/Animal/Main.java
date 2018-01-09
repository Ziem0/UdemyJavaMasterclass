package allInOne;

/**
 * Created by Ziemo on 8/1/2017.
 */

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 20);
        Dog dog = new Dog("Pinia", 2, 12, 2, 1, 4, 6, "oldLove");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
