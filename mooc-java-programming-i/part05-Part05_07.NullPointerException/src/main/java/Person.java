/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String name) {
        this.name = name;
        this.age = age;
    }
    
    public void growOlder() {
        this.age--;
    }
    
    public String toString() {
        return name + ", " + age;
    }
}
