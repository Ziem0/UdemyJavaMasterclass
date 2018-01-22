package Generics.Ex;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String type;
    private LeagueTable leagueTable;


    public League(String type) {
        this.type = type;
        this.leagueTable = new LeagueTable();
    }

    public void addTeam(T team) {
        leagueTable.getTable().add(team);

    }

    public void showTable() {
        int num = 1;
        sortTable();
        System.out.println("\n\nResults for " + type + " league\n");
        for (T team : leagueTable.getTable()) {
            System.out.println(num+". " + team);
            num++;
        }
    }

    private void sortTable() {
        Collections.sort(leagueTable.getTable());
    }



    private class LeagueTable {
        private ArrayList<T> table;

        private LeagueTable() {
            this.table = new ArrayList<>();
        }

        private ArrayList<T> getTable() {
            return table;
        }
    }




}
