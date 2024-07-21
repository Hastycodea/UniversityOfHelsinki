
public class Cat extends Animal implements NoiseCapable {

    private String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public Cat() {
        super("Cat");
        this.name = "Cat";
    }
    
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }

}
