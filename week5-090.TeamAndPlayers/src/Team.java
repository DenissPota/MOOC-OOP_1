
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis
 */
public class Team {

    private String name;
    private int maxSize = 16;

    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (size() < maxSize) {
            players.add(player);        
            size();
        }
     

    }

    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p);

        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;

    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int goals = 0;
        for (int i = 0; i < players.size(); i++) {
            goals += players.get(i).goals();
        }
        return goals;
    }

}
