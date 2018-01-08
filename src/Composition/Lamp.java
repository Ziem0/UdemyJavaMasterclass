package Composition;

public class Lamp {
    private boolean onBattery;
    private String color;

    public Lamp(boolean onBattery, String color) {
        this.onBattery = onBattery;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isOnBattery() {
        return onBattery;
    }

    public void turnOn() {
        System.out.println("Lamp is on");
    }
}
