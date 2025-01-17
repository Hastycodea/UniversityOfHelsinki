
public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    //Leo, has a friend called Lucy (golden retriever)
    @Override
    public String toString() {
        return this.name + ", has a friend called " +pet.getName()+ "(" +pet.getBreed()+ ")";
    }

}
