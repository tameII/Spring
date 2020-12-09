package com.trucmuche.art.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Painting {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String type = "painting";
    private String title;
    private String author;


    protected Painting() { }


    /**
     * Build a painting with no fixed id
     * @param title
     * @param author
     */
    public Painting(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * build a painting with an id
     * @param id care because i don't know if it will conflict with the generated Id
     * @param title
     * @param author
     */
    public Painting(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }





    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}