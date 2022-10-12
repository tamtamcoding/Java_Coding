package pair.programming.day4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("hakim");
        employee.setLastName("ammar");
        employee.setDepartment("Sport");
        employee.setPosition("football specialist");
        System.out.println("first name " + employee.getFirstName() + " last name " + employee.getLastName()
                + " department " + employee.getDepartment() + " position " + employee.getPosition());


        Employee employee1 = new Employee("Tam", "Arifin", "IT", "Developer");
        String hello = employee1.printDetails("Tam", "Arifin", "IT", "Developer");
        System.out.println(hello);

        Developer developer = new Developer("Java", 26, 2022, true);
       developer.developerDetails("Java", 26, 2022, true);
    }

}
