package com.ats.Food_Recipe_Sharing_Application.datamodels.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cat_id")
    @SequenceGenerator(initialValue = 401, name = "cat_id", allocationSize = 1)
    private int id;
    private String name;
    @ManyToMany
     @JoinTable(joinColumns = @JoinColumn, inverseJoinColumns = @JoinColumn)
    List<Recipe> recipes;
}
