package com.ats.Food_Recipe_Sharing_Application.datamodels.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator= "recipe_id")
    @SequenceGenerator(initialValue = 301, name = "recipe_id", allocationSize = 1)
    private int recipeId;
    private String title;
    private String description;
    private int steps;
    private String created_date;

    @ManyToOne
    private Users users;

    @OneToMany(mappedBy = "recipe")
    private List<Rating> ratings;

    @OneToMany
    @JoinColumn
    private List<Ingredients> ingredients;

    @ManyToMany(mappedBy = "recipes")
    private List<Category> categories;
}
