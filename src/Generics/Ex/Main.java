package Generics.Ex;

public class Main {
    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.

    public static void main(String[] args) {

        FootballTeam footballTeam = new FootballTeam("Juve");
        FootballTeam footballTeam1 = new FootballTeam("ManU");
        FootballTeam footballTeam2 = new FootballTeam("Barca");
        FootballTeam footballTeam3 = new FootballTeam("Legia");

        BasketballTeam basketballTeam = new BasketballTeam("Lakers");
        BasketballTeam basketballTeam1 = new BasketballTeam("Bulls");
        BasketballTeam basketballTeam2 = new BasketballTeam("Cavs");
        BasketballTeam basketballTeam3 = new BasketballTeam("Celtics");

        League<FootballTeam> FootballLeague = new League<FootballTeam>("FootballTeam League");
        FootballLeague.addTeam(footballTeam);
        FootballLeague.addTeam(footballTeam1);
        FootballLeague.addTeam(footballTeam2);
        FootballLeague.addTeam(footballTeam3);

        League<BasketballTeam> NBA = new League<BasketballTeam>("NBA");
        NBA.addTeam(basketballTeam);
        NBA.addTeam(basketballTeam1);
        NBA.addTeam(basketballTeam2);
        NBA.addTeam(basketballTeam3);

        basketballTeam.setWon(4);
        basketballTeam1.setWon(3);
        basketballTeam2.setWon(5);
        basketballTeam3.setWon(7);

        NBA.showTable();

        footballTeam.setWon(12);
        footballTeam1.setWon(3);
        footballTeam2.setWon(44);
        footballTeam3.setWon(23);

        FootballLeague.showTable();
    }
}
