package udemyExercise.OOP.ClassesExercise.BillsBurger;

public class Hamburger {

    private double price;
    private String name;
    private String breadRollType;
    private String meat;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(double price, String name, String breadRollType, String meat) {
        this.price = price;
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }
    public void addHamburgerAddition1(String name, double price) {
        addition1Price = price;
        addition1Name = name;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Price = price;
        addition2Name = name;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Price = price;
        addition3Name = name;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Price = price;
        addition4Name = name;
    }
    public double itemizeHamburger() {
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name);
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);
    }

}
