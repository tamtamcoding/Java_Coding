package pair.programming.day2;

import java.util.Scanner;

public class simpleBankApps {
    public static void main(String[] args) {
        int choice = 0;
        double addition = 0;
        double transfer = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Greeting! , Please input Your Name");
        String name = scan.nextLine();
        System.out.println("Your current balance is ");
        double balance = scan.nextDouble();
        System.out.println("Hello and Good Day! " + name);
        System.out.println("Your Account Balance : RM" + balance);
        while(choice != 4){
            System.out.println("How May we serve you today ? \n 1 - Check balance\n 2 - Add Funds\n 3 - Transfer Funds\n 4- Exit Apps");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello " + name + " Your Current Balance is : RM" + balance);
                    break;
                case 2:
                    System.out.println("Kindly key in your desire amount : ");
                    addition = scan.nextDouble();
                    double total = addition + balance;
                    System.out.println("Thank you for banking with us. Your current balance is: RM" + total);

                    break;
                case 3:
                    System.out.println("Kindly key in your desire amount : ");
                    transfer = scan.nextDouble();
                    if(transfer >= balance){
                        System.out.println("Oops! your current balance is insufficient");}
                    else{

                    double left = balance - transfer;
                    System.out.println("You Transferred: RM" + transfer + "\n your current balance is: RM " + left);}
                    break;
                default:
                    System.out.println("Thank you for Banking with us. Hope to see you soon");
            }
        }

    }
}
