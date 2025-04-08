import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String u = "admin";
        String p = "123";
        char operation;
        int choice;
        float amount=0;
        float deposit;
        float withdraw;

        System.out.println("Enter Username :");
        String username = input.nextLine();
        System.out.println("Enter Password :");
        String password = input.nextLine();

        if(u.equals(username) && p.equals(password)){
            System.out.println("Login Successfull !! , Welcome +"+username);
            Arham:
            while(true){
            System.out.println("\n**************************************");
            System.out.println("Welcome to Bank of Pakistan");
            System.out.println("****************************************");
            System.out.println("1. Deposit Money \t 2. Withdraw Amount \t 3. Account Status ");
            System.out.println("****************************************");
            System.out.println("Select Your Choice :-");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    {
                        System.out.print("Enter Amount to deposit :");
                        deposit = input.nextFloat();
                        if(deposit>0){
                            System.out.println("Amount Added Succesfully !");
                            System.out.print("New Balance :"+(amount += deposit));
                            System.out.println("Do you Want to Continue [Yes : Y/y ; No : N/n]");
                            operation = input.next().charAt(0);
                            if(operation == 'Y' || operation == 'y'){
                                continue Arham;
                            }
                            else{
                                System.exit(0);
                            }

                        }
                        else{
                            System.out.println("Invalid Input");
                        }
                    }
                    case 2 : {
                        System.out.println("Enter Amount to Withdraw :");
                        withdraw = input.nextFloat();
                        if(withdraw > amount){
                            System.out.println("Insufficient Funds !");
                        }
                        else{
                            amount -= withdraw;
                            System.out.println("Amount Withdrawn Successfully !");
                            System.out.print("New Balance :"+amount);
                            System.out.println("Do you Want to Continue [Yes : Y/y ; No : N/n]");
                            operation = input.next().charAt(0);
                            if(operation == 'Y' || operation == 'y'){
                                continue Arham;
                            }
                            else{
                                System.exit(0);
                            }
                        }

                    }
                    case 3 : {
                        System.out.println("Account Status :\n Balance :"+amount +"\nUsername : "+username);
                        System.out.println("Do you Want to Continue [Yes : Y/y ; No : N/n]");
                        operation = input.next().charAt(0);
                        if(operation == 'Y' || operation == 'y'){
                            continue Arham;
                        }
                        else{
                            System.exit(0);
                        }    
                    }
                    default : {
                        System.out.println("Invalid Input");
                        System.out.println("Do you Want to Continue [Yes : Y/y ; No : N/n]");
                        operation = input.next().charAt(0);
                        if(operation == 'Y' || operation == 'y'){
                            continue Arham;
                        }
                        else{
                            System.exit(0);
                        } 
                    }
            }
            
            }
        }
    }
}