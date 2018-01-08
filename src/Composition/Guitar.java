package Composition;

public class Guitar {
    private int string;
    private String type;
    private String color;
    private boolean tuned;

    public Guitar(int string, String type, String color, boolean tuned) {
        this.string = string;
        this.type = type;
        this.color = color;
        this.tuned = tuned;
    }

    public int getString() {
        return string;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void play() {
        System.out.println("Tadam! It sounds great!");
    }
}
