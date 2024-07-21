/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }
    
    public Integer getPages() {
        return pages;
    }
    
    public Integer getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getPages() + " pages, " + getPublicationYear();           
    }
}
