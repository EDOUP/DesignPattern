package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriterialPatternDemo {
    public static void main(String[] args){
        List<Person> persons=new ArrayList<Person>();

        persons.add(new Person("Robert","Male","Single"));
        persons.add(new Person("John","Male","Married"));
        persons.add(new Person("Laura","Female","Married"));
        persons.add(new Person("Diana","Female","Single"));
        persons.add(new Person("mike","Male","Single"));
        persons.add(new Person("Bobby","Male","Single"));

        Criteria male=new CriteriaMale();
        Criteria female=new CriterialFemale();
        Criteria single=new CriterialSingle();
        Criteria singleMale=new AndCriterial(single,male);
        Criteria singleOrFemale=new OrCriterial(single,female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));
        System.out.println("\nfemales: ");
        printPersons(female.meetCriteria(persons));
        System.out.println("\nSingle Male: ");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println("\nSingle Or Females:");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons){
        for (Person person:persons){
            System.out.println("Person:[ Name:"+person.getName()+",Gender :"+
                    person.getGender()+",Mariter Status :"+person.getMaritalStatus()+"]");
        }
    }
}
