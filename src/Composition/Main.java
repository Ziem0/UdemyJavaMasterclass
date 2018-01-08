package Composition;

public class Main {
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.

    public static void main(String[] args) {

        Wall wall1 = new Wall("North", "black");
        Wall wall2 = new Wall("South", "black");
        Wall wall3 = new Wall("East", "black");
        Wall wall4 = new Wall("West", "black");
        Bed bed = new Bed("black", "Big", true);
        Guitar guitar = new Guitar(6, "Electric", "Black", true);
        Lamp lamp = new Lamp(true, "black");
        Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, bed, guitar, lamp);
        bedroom.makeBed();
        bedroom.getGuitar().play();
        bedroom.getLamp().turnOn();

    }


}
