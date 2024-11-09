package com.ats.Food_Recipe_Sharing_Application.datamodels.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "ratingid_gen")
    @SequenceGenerator(initialValue = 201,allocationSize = 1,name="ratingid_gen")
    private int id;
    private double score;
    private String comment;

    @OneToMany
    @JoinColumn
    private Recipe recipes;

}
