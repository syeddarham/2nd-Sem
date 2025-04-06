package Q2;

import java.util.Scanner;

public class Game {
    private Team team1;
    private Team team2;
    private Goal goal;
    private Ball ball;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goal = new Goal();
        this.ball = new Ball();
    }
    public void startGame(){
        System.out.println("Game Start! Score the Goal with least hits. Goal at(3,3)");
        play(team1);
        ball = new Ball();
        play(team2);
        declare_winner();
    }
    public void play(Team team){
        Scanner sc = new Scanner(System.in);
        System.out.println(team.getTeamName()+ " is playing!");
        while (!goal.isGoalReached(ball.getX(), ball.getY())){
            String move;
            System.out.println("Enter your choice: ");
            System.out.println("(Up)--(Down)--(Left)--(Right)");
            move = sc.nextLine();
            team.getRobot().hit_ball(ball, move);
            System.out.println(team.getTeamName()+" moved the ball "+move+". New coordinates("+ball.getX()+")("+ball.getY()+")");
        }
        System.out.println(team.getTeamName()+" reached goal with "+team.getRobot().getHits()+" hits!");
    }

    public void declare_winner(){
        if(team1.getRobot().getHits()<team2.getRobot().getHits()){
            System.out.println(team1.getRobot()+" Won the match with "+team1.getRobot().getHits()+" hits!");
        } else if (team2.getRobot().getHits()<team1.getRobot().getHits()) {
            System.out.println(team2.getRobot()+" Won the match with "+team2.getRobot().getHits()+" hits!");
        }
        else {
            System.out.println("It is a tie!");
        }
    }
}
