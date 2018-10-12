package filterpattern;

import java.util.List;

public class AndCriterial implements Criteria {

    private Criteria criteria;
    private Criteria otherCriterial;

    public AndCriterial(Criteria criteria,Criteria otherCriterial){
        this.criteria=criteria;
        this.otherCriterial=otherCriterial;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersions=criteria.meetCriteria(persons);
        return otherCriterial.meetCriteria(firstCriteriaPersions);
    }
}
