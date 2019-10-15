package pl.bb.ksiazka_kucharska.model;

import pl.bb.ksiazka_kucharska.model.Category;

import javax.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(columnDefinition = "LONGTEXT")
    private String ingredients;
    @Column(columnDefinition = "LONGTEXT")
    private String description;
    private int likes;
    @ManyToOne
    private Category category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Recipe() {
    }

    public Recipe(Category category, String name, String ingredients, String description, int likes) {
        this.category = category;
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.likes = likes;
    }
}
