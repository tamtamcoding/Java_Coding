package pair.programming.day6;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("##.00");
        Contributor contributorNew = new Contributor("Tam","Arifin",26, 10000);
        Ordinary ordinary = new Ordinary(contributorNew, "Ordinary Account");
        Medisave medisave = new Medisave(contributorNew, "Medi-Save Account");
        Special special = new Special(contributorNew, "Special Account");
        double salary = contributorNew.getSalary();
        String salaryDisplay = decimal.format(salary);
        System.out.println("Salary : RM " + salaryDisplay);
        ordinary.displayContribution();
        special.displayContribution();
        medisave.displayContribution();

    }
}
