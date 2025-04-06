
class Tournament {
    Tournament() {
        System.out.println("Champions Trophy 2025 Tournament Created");
    }

    Tournament(String hostCountry) {
        this();
        System.out.println("Host Country: " + hostCountry);
    }

    Tournament(String hostCountry, int noOfTeams) {
        this(hostCountry);
        System.out.println("Number of Teams: " + noOfTeams);
    }
}

class Team extends Tournament {
    Team() {
        this("Unknown Team");
        System.out.println("Team's Default Constructor");
    }

    Team(String teamName) {
        super("Pakistan", 8);
        System.out.println("Participating Team: " + teamName);
    }
}

class Player extends Team {
    Player() {
        this("Unknown Player", "All-Rounder");
        System.out.println("Player's Default Constructor");
    }

    Player(String playerName) {
        super("Pakistan Team");
        System.out.println("Player Name: " + playerName);
    }

    Player(String playerName, String role) {
        this(playerName);
        System.out.println("Player Role: " + role);
    }
}

public class Q11 {
    public static void main(String[] args) {
        System.out.println("Creating Player Object 1:");
        Player p1 = new Player();

        System.out.println("\nCreating Player Object 2:");
        Player p2 = new Player("Virat Kohli", "Right Handed Batsman");
    }
}
