package Q2;

public class Robot {
    String Robot_name;
    int hits;

    Robot(String robot_name){
        this.Robot_name=robot_name;
        this.hits=0;
    }
    public int getHits() {
        return hits;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }
    public String getName() {
        return Robot_name;
    }
    public void setName(String name) {
        this.Robot_name = name;
    }

    void hit_ball(Ball ball,String direction){
        if(direction.equalsIgnoreCase("right")){
        ball.move(1,0);
        }
        if(direction.equalsIgnoreCase("left")){
            ball.move(-1,0);
        }
        if (direction.equalsIgnoreCase("up")){
            ball.move(0,-1);
        }
        if (direction.equalsIgnoreCase("down")){
            ball.move(0,1);
        }
        this.hits++;
    }

}
