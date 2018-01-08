package Composition;

public class Bed {
    private String color;
    private String size;
    private boolean pillows;

    public Bed(String color, String size, boolean pillows) {
        this.color = color;
        this.size = size;
        this.pillows = pillows;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void make() {
        System.out.println("Bed has just done");
    }
}
