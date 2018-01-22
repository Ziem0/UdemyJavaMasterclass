package Generics.Ex;

public abstract class Team implements Comparable<Team>{
    private String team;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;


    public Team(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public int result() {
        return (won * 3) + tied;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public String toString() {
        return team +" \n\tplayed: " + played + " \twon: " + won + " \tlost: " + lost + " \ttied: " + tied;
    }

    @Override
    public int compareTo(Team team) {
        if (this.result() > team.result()) {
            return -1;
        } else if (this.result() < team.result()) {
            return 1;
        }
        return 0;
    }
}
