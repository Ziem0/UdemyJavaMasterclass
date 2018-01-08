package allInOne;

public class Animal {
    private String name;
    private int body;
    private int brain;
    private int size;
    private int weight;

    public Animal(String name, int body, int brain, int size, int weight) {
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {

    }

    public void move() {

    }

}
