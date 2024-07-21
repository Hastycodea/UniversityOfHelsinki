
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person heightToReturn = this.persons.get(0);

        for (Person prsn : this.persons) {
            if (prsn.getHeight() < heightToReturn.getHeight()) {
                heightToReturn = prsn;

            }
        }
        return heightToReturn;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;            
        }
        
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
       
}
