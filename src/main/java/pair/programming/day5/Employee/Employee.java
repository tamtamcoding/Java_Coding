package pair.programming.day5;

public class Employee {
    private int id;
    private String name;
    private String email;
    private int vacationDays;
    //constructor


    public Employee(int id, String name, String email, int vacationDays) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.vacationDays = vacationDays;
    }

    public void printDetails(){
        System.out.println("ID :" + id +"\n" + " Name : " + name +"\n" + "Email : " + email +
                "\n" + "Vacation Days " + vacationDays );
    }
    //getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getVacationDays() {
        return vacationDays;
    }
    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}
