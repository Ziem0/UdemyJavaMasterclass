package Interfaces.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private int strenght;
    private String weapon;

    public Player(String name, int strenght, String weapon) {
        this.name = name;
        this.strenght = strenght;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getStrenght() {
        return strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strenght='" + strenght + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> attributes = new ArrayList<>();
        attributes.add(0, this.name);
        attributes.add(1, ""+this.strenght);
        attributes.add(2, this.weapon);

        return attributes;
    }

    @Override
    public void read(List data) {
        if (data != null && data.size() > 0) {
            this.name = data.get(0).toString();
            this.strenght = Integer.parseInt(data.get(1).toString());
            this.weapon = data.get(2).toString();

        }
    }
}
