package Q2;

public class Goal {
    private final int y = 3;
    private final int x = 3;

    public Boolean isGoalReached(int y, int x) {
        if(this.y == y && this.x == x)
        {
            return true;
        }
        else return false;
    }
}
