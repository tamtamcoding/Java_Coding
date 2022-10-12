package pair.programming.day7;

import com.accenture.day6.exceptions.customexception.CustomException;

import static pair.programming.day7.InvalidUserDetailException.*;

public class EmployeeValidation extends Employee {


    public void validateInput(Employee employee) throws InvalidUserDetailException{
        try {
            if (employee.getName().length() < 3){
                throw new InvalidUserDetailException(NAME_IS_LESS);
            } else if (employee.getAge() < 16 || employee.getAge() > 65) {
                throw new InvalidUserDetailException(AGE_NOT_IN_RANGE);
            }
            else if(!(employee.getGender().equalsIgnoreCase("female"))){
                throw new InvalidUserDetailException(GENDER_INVALID);
            }
            else if(!(employee.getGender().equalsIgnoreCase("male"))){
                throw new InvalidUserDetailException(GENDER_INVALID);
            }
            else {
                System.out.println("*** Employee Details ***");
                System.out.println("Name : " + employee.getName() + "\nAge : " + employee.getAge() + "\nGender : " + employee.getGender());
            }
        }  catch (InvalidUserDetailException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
