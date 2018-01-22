package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static ArrayList<Team> teams = new ArrayList<>();

    public static void main(String[] args) {
        FootballPlayer footballer = new FootballPlayer("Del Piero");
        FootballPlayer footballer1 = new FootballPlayer("Vialli");
        FootballPlayer footballer2 = new FootballPlayer("Ravanelli");
        FootballPlayer footballer3 = new FootballPlayer("Baggio");

        BasketballPlayer baller = new BasketballPlayer("Jordan");
        BasketballPlayer baller1 = new BasketballPlayer("Pippen");
        BasketballPlayer baller2 = new BasketballPlayer("Rodman");
        BasketballPlayer baller3 = new BasketballPlayer("Kukoc");

        Team<FootballPlayer> team1 = new Team<>("Juventus");
        teams.add(team1);
        team1.addPlayer(footballer);
        team1.addPlayer(footballer1);
        team1.addPlayer(footballer2);
        team1.addPlayer(footballer3);
        Team<FootballPlayer> team2 = new Team<>("AC Milan");
        teams.add(team2);
        team2.addPlayer(footballer);
        team2.addPlayer(footballer1);
        team2.addPlayer(footballer2);
        team2.addPlayer(footballer3);

        Team<BasketballPlayer> team3 = new Team<>("Chicago Bulls");
        teams.add(team3);
        team3.addPlayer(baller1);
        team3.addPlayer(baller2);
        team3.addPlayer(baller);
        team3.addPlayer(baller3);
        Team<BasketballPlayer> team4 = new Team<>("Utah Jazz");
        teams.add(team4);
        team4.addPlayer(baller);
        team4.addPlayer(baller1);
        team4.addPlayer(baller2);
        team4.addPlayer(baller3);

        team1.matchResult(team2, 3, 2);
        team2.matchResult(team1, 4, 4);

        team3.matchResult(team4, 124, 90);
        team4.matchResult(team3, 126, 125);

        Collections.sort(teams);
        System.out.println("\n\t\t\tRankings");

        for (Team team : teams) {
            System.out.println(team);
        }
    }
}
