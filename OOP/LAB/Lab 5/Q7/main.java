package Q7;

import java.util.*;

class Player {
    private String name;
    private String role;
    private int performanceStats;

    public Player(String name, String role, int performanceStats) {
        this.name = name;
        this.role = role;
        this.performanceStats = performanceStats;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getPerformanceStats() {
        return performanceStats;
    }
}

class Team {
    private String name;
    private String country;
    private String coach;
    private List<Player> players;

    public Team(String name, String country, String coach, Player... players) {
        this.name = name;
        this.country = country;
        this.coach = coach;
        this.players = new ArrayList<>(Arrays.asList(players));
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCoach() {
        return coach;
    }

    public void generateReport() {
        System.out.println("Team Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Coach: " + coach);
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println("  Name: " + player.getName());
            System.out.println("  Role: " + player.getRole());
            System.out.println("  Performance Stats: " + player.getPerformanceStats());
        }
    }

    public void delete() {
        players.clear();
    }
}
public class main {
    public static void main(String[] args) {
        Team team = new Team("Quetta Gladiator", "Pakistan", "Sir Viv Richard");
        team.addPlayer(new Player("Jason Roy", "Batsman", 90));
        team.addPlayer(new Player("Muhammad Amir", "Bowler", 85));
        team.addPlayer(new Player("Akeal Hosein", "All-Rounder", 83));
        team.addPlayer(new Player("Sarfaraz Ahmed", "Wicket-Keeper Batsman", 80));
        team.generateReport();
        team.delete();
        team.generateReport();
    }
}
