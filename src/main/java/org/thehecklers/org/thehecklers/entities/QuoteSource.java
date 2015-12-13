package org.thehecklers.org.thehecklers.entities;

/**
 * Created by markheckler on 12/13/15.
 */
public class QuoteSource {
    private Integer id;
    private String name;
    private String description;

    public QuoteSource() {
    }

    public QuoteSource(String name) {
        this.name = name;
    }

    public QuoteSource(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public QuoteSource(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
