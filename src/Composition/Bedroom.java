package Composition;

public class Bedroom {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bed bed;
    private Guitar guitar;
    private Lamp lamp;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Guitar guitar, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.guitar = guitar;
        this.lamp = lamp;
    }

    public void makeBed() {
        System.out.println("System is making bad for this room");
        bed.make();
    }

    public Guitar getGuitar() {
        return guitar;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
