package pair.programming.day6;

public abstract class Account {
    private Contributor contributor;
    private String accountType;

    public Account(Contributor contributor, String accountType) {
        this.contributor = contributor;
        this.accountType = accountType;

    }

    public Contributor getContributor() {
        return contributor;
    }

    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public abstract double getContributionRate();

    public double calculateContribution(){
        return 1.0;
    }
    public void displayContribution(){
        System.out.println("method called");
        System.out.println(getContributionRate());
    }
}
