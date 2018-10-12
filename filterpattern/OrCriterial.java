package filterpattern;

import java.util.List;

public class OrCriterial implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriterial(Criteria criteria,Criteria otherCriteria){
        this.criteria=criteria;
        this.otherCriteria=otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriterialItems=criteria.meetCriteria(persons);
        List<Person> otherCriterialItems=otherCriteria.meetCriteria(persons);
        for(Person person:otherCriterialItems){
            if(!firstCriterialItems.contains(person)){
                firstCriterialItems.add(person);
            }
        }
        return firstCriterialItems;
    }
}
