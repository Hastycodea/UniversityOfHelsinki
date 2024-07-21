
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(p -> this.persons.add(p));
    }

    public void print() {
        this.persons.stream().forEach(p -> System.out.println(p));
    }

    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
