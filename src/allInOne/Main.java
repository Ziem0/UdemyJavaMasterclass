package allInOne;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 20);
        Dog dog = new Dog("Pinia", 2, 12, 2, 1, 4, 6, "oldLove");
        dog.eat();
    }
}
