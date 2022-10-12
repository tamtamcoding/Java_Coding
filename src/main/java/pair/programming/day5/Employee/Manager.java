package pair.programming.day5;

public class Manager extends Employee{
    private int numberOfReportees;
    // constructor

    public Manager(int id, String name, String email, int vacationDays, int numberOfReportees) {
        super(id, name, email, vacationDays);
        this.numberOfReportees = numberOfReportees;
    }


    //setter and getter

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }
    //method
    private void printManagerDetails(int id, String name, String email, int vacationDays,int numberOfReportees){
        System.out.println("ID :" + id +"\n" + "Name : " + name +"\n" + "Email : " + email +
                "\n" + "Vacation Days " + vacationDays + "\n" + "number of reportees : " + numberOfReportees );
    }

    @Override
    public void printDetails() {
        printManagerDetails(getId(), getName(), getEmail(), getVacationDays(), getNumberOfReportees());
    }
}
