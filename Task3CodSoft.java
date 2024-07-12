package task3codsoft;
import java.util.Scanner;
public class Task3CodSoft {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        atm a1 = new atm(5000);
        boolean flag = false;
        System.out.println("Welcome to ATM bank account.");
        
        do{
                System.out.println("Choose a number from the list.");
                System.out.println("1:withdraw");
                System.out.println("2:deposit");
                System.out.println("3:Check balance");
                System.out.println("4:Exit");

                int num = in.nextInt();
            
           switch(num){
              
               case 1 :
                   System.out.println("Enter amount to withdraw:");
                   double amountToWithdraw = in.nextDouble();
                   a1.withdraw(amountToWithdraw);
                   flag = false;
                   break;
               case 2 :  
                   System.out.println("Enter amount to deposite:");
                   double amountToDeposite = in.nextDouble();
                   a1.deposit(amountToDeposite);
                   flag = false;
                   break;
               case 3 :
                   a1.checkBalance();
                   flag = false;
                   break;
               case 4 :
                   System.out.println("Thank you for using ATM bank account."); 
                   flag = true;
                   break;
               default:
                   System.out.println("Invaild Input , please try again.");
                   flag = false;
                   break;
           
           }
        
        
        
        }while(!flag);
    }
    
}
