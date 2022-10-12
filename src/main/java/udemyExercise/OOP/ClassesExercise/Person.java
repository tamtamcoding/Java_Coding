package udemyExercise.OOP.ClassesExercise;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age < 0 || age > 100){
            this.age = 0;
        }
    }
    public boolean isTeen() {
        return (this.age > 12 && this.age < 20) ; //returns true
    }
    public void getFullName(){
        if(lastName.isEmpty()){
            System.out.println(getFirstName());
        }else if(firstName.isEmpty()){
            System.out.println(getLastName());
        }
        System.out.println(getFirstName() + " " + getLastName());
    }

}
