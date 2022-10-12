package pair.programming.day8;

import java.util.ArrayList;
import java.util.List;

public class ContributionUtility {
    private List<Contribution> contributionList = new ArrayList<Contribution>();


    public List<Contribution> getContributionList(Contribution contribution) {
        return contributionList;
    }

    public void addContribution(Contribution contribution){
       if(contribution!=null) {
           contributionList.add(contribution);
       }
    }

    public void updateContribution(String date, Contribution contribution){
        if(!contributionList.isEmpty() && date != null){
            for(Contribution contrib: contributionList){
                contrib.setContributionAmount(contribution.getContributionAmount());
                contrib.setContributionDate(contribution.getContributionDate());
            }
        }

    }
}
