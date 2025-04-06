package Q2;

public class Ball {
    private int x;
    private int y;

     Ball(int x,int y){
         this.x = x;
         this.y = y;
     }
     Ball(){
         this.x = 0;
         this.y = 0;
     }
     public int getX() {
         return x;
     }
     public int getY() {
         return y;
     }
     public void move(int dx,int dy) {
         this.x += dx;
         this.y += dy;
     }
     public int[] getPosition(){
         return new int[]{this.x,this.y};
     }
}
