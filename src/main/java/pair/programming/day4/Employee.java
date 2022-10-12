package pair.programming.day4;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String position;

    public Employee(){
        System.out.println("empty constructor called");
    }
    public Employee(String firstName, String lastName, String department, String position){
        System.out.println("parameterized constructor called");
        System.out.println( "first name " + firstName + " lastname " + lastName + " department " + department +
                " position " + position);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
    }
    public String printDetails(String firstName, String lastName, String department , String position){
        this.firstName = getFirstName();
        this.lastName = getLastName();
        this.department = getDepartment();
        this.position = getPosition();
        return "first name " + firstName + " lastname " + lastName + " department " + department + " position " + position;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
