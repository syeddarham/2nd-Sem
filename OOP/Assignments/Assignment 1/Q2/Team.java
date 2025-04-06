package Q2;

public class Team {
    private String TeamName;
    private Robot robot;


    Team(String TeamName,Robot robot) {
        this.TeamName = TeamName;
        this.robot = robot;
    }

    public String getTeamName() {
        return TeamName;
    }
    public Robot getRobot() {
        return robot;
    }

}
