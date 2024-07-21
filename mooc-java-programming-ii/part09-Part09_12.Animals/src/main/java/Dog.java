
public class Dog extends Animal implements NoiseCapable {

    private String name;
    private String dogName;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public Dog() {
        super("Dog");
        this.name = "Dog";
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }

}
