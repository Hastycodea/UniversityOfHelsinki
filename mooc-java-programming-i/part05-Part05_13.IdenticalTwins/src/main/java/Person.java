import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        // if the objects are the same instance, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not an instance of Person, they are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        // cast the object to Person
        Person comparedPerson = (Person) compared;

        // compare all relevant fields
        return this.name.equals(comparedPerson.name)
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight
                && this.birthday.equals(comparedPerson.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, height, weight);
    }
}
