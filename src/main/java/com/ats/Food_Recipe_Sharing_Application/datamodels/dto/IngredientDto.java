package com.ats.Food_Recipe_Sharing_Application.datamodels.dto;

import lombok.Data;

@Data
public class IngredientDto {

    private int ingredientsName;
    private int quantity;
    private int unit;
    private double price;
}
