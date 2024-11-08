package com.ats.Food_Recipe_Sharing_Application.datamodels.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ,generator = "ingredients_id")
    @SequenceGenerator(initialValue = 501,name = "ingredients_id",allocationSize = 1)
    private int ingredientsId;
    private String ingredientsName;
    private int quantity;
    private int unit;
    private double price;

}
