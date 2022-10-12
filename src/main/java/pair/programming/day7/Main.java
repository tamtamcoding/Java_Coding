package pair.programming.day7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidUserDetailException{
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String gender = scan.nextLine();
        int age = scan.nextInt();

        scan.nextLine();
        Employee employee = new Employee(name, age, gender);
        EmployeeValidation employeeValidation = new EmployeeValidation();
        employeeValidation.validateInput(employee);

    }
}
