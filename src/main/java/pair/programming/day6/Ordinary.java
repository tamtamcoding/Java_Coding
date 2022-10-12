package pair.programming.day6;

import java.text.DecimalFormat;

public class Ordinary extends Account {

    public Ordinary(Contributor contributor, String accountType) {
        super(contributor, accountType);
    }

    @Override
    public double getContributionRate() {
        return 0.06;
    }

    @Override
    public void displayContribution() {
        DecimalFormat total = new DecimalFormat("##.00");
        double totalValue =(getContributor().getSalary()) * getContributionRate();
        String totalNumber = total.format(totalValue);
        System.out.println("=== " + getAccountType() + " === \nContribution Amount : RM " + totalNumber);
    }
}
