/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Song {
    private String name;
    private int lengthInSeconds;
    
    public Song(String name, int length) {
        this.name = name;
        this.lengthInSeconds = length;
    }
    
    public String name() {
        return this.name;
    }
    
    public int length() {
        return this.lengthInSeconds;
    }
    
    
}
