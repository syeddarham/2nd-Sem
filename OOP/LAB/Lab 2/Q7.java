import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String [] a = new String[5];
            System.out.println("Enter the titles of 5 Books: ");
            for(int i = 0;i<5 ;i++){
                System.out.println("Book "+(i+1)+": ");
                a[i] = sc.nextLine();
            }
            System.out.println("Library Reciept ");
            System.out.println("Borrowed Books: ");
            for (int i = 0; i < 5; i++) {
                System.out.println("Book "+(i+1)+": "+a[i]);
            }
            System.out.println("Fine Per Day: $2");
            System.out.println("Continue for : Another User {y/n}");
            if(sc.nextLine().equals("n")){
                break;
            }
        }
        sc.close();
    }
}
