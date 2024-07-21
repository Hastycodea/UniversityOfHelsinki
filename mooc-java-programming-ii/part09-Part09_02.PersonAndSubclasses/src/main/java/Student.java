
public class Student extends Person {
    private int study;

    public Student(String name, String street) {
        super(name, street);
        this.study = 0;
    }
    
    public void study() {
        this.study++;
    }
    
    public int credits() {
        return this.study;
    }
    
@Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits();
    }
    
}
