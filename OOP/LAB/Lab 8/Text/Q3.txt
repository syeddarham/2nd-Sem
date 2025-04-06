package Q3;

class Robot {
    protected int x;
    protected int y;
    protected char direction;

    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void getInitialPosition(){
        System.out.println("x: " + x + " y: " + y + " direction: " + direction);
    }
}

class MovingRobot extends Robot {
    public MovingRobot(int x, int y, char direction) {
        super(x, y, direction);
    }

    public void moveRobot(int steps){
        switch(direction){
            case 'N':
                y+=steps;
                break;
            case 'S':
                y-=steps;
                break;
            case 'E':
                x+=steps;
                break;
            case 'W':
                x-=steps;
                break;
            default:
                System.out.println("Invalid direction");
        }
    }
    public void getUpdatedPosition(){
        System.out.println("x: " + x + " y: " + y + " direction: " + direction);
    }
}
public class Main {
    public static void main(String[] args) {
        MovingRobot robot = new MovingRobot(3, 3, 'N');
        robot.getInitialPosition();
        robot.moveRobot(5);
        robot.getUpdatedPosition();
    }
}
