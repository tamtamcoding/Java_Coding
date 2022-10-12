package pair.programming.day2;

import java.util.Scanner;
class Calculator {
public double Add(double firstValue , double secondValue){
    return firstValue + secondValue;
}
public double Minus(double firstValue , double secondValue){
    return firstValue - secondValue;
}
public double Times(double firstValue , double secondValue){
    return firstValue * secondValue;
}
public double Division(double firstValue , double secondValue){
    return firstValue / secondValue;
}
}
public class groupActivity {
    public static void main(String[] args) {
        int choice = 0;
        while(choice != 5){
            if(choice > 5){
                System.out.println("your choice is invalid");
            }
            Calculator simplify = new Calculator();
            Scanner scan = new Scanner(System.in); //establish new object
            System.out.println("Please select function :\n 1 - Addition\n 2 - Subtraction\n 3 - Multiplication\n 4 - Division\n 5 - Exit the program");
            choice = scan.nextInt();
            double firstValue = 0;
            double secondValue = 0;
            switch(choice) {
                case 1:
                    System.out.println("PLease enter your First value : ");
                    firstValue = scan.nextDouble();
                    System.out.println("Please enter your second Value : ");
                    secondValue = scan.nextDouble();
                    System.out.println("Output : " + simplify.Add(firstValue,secondValue));
                    break;
                case 2:
                    System.out.println("PLease enter your First value : ");
                    firstValue = scan.nextDouble();
                    System.out.println("Please enter your second Value : ");
                    secondValue = scan.nextDouble();
                    System.out.println("Output : " + simplify.Minus(firstValue,secondValue));
                    break;
                case 3:
                    System.out.println("PLease enter your First value : ");
                    firstValue = scan.nextDouble();
                    System.out.println("Please enter your second Value : ");
                    secondValue = scan.nextDouble();
                    System.out.println("Output : " + simplify.Times(firstValue,secondValue));
                    break;
                case 4:
                    System.out.println("PLease enter your First value : ");
                    firstValue = scan.nextDouble();
                    System.out.println("Please enter your second Value : ");
                    secondValue = scan.nextDouble();
                    System.out.println("Output : " + simplify.Division(firstValue,secondValue));
                    break;
                default:
                    System.out.println("thank you for using our services");
            }

        }



    }
}
