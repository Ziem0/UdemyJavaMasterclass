package Generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on " + this.getName());
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for " + this.getName());
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (this.won * 3) + tied;
    }

    public String toString() {
        return this.getName() + " : " + ranking();
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }
}
