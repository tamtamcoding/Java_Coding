package pair.programming.day4;

public class Developer extends Employee{
    private String skills;
    private int age;
    private int year;
    private boolean happy;

    public Developer(String skills, int age, int year, boolean happy) {
        System.out.println("child class called");
        this.skills = skills;
        this.age = age;
        this.year = year;
        this.happy = happy;
    }
    private void developerInfo(String skills, int age, int year, boolean happy){
        System.out.println(skills + " " + age + " " + year + " " + happy );
    }

    public void developerDetails(String skills, int age, int year, boolean happy) {
        this.skills = skills;
        this.age = age;
        this.year = year;
        this.happy = happy;
        System.out.println(skills + " " + age + year + happy);
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
