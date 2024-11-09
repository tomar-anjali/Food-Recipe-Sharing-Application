package com.ats.Food_Recipe_Sharing_Application.datamodels.dto;

import lombok.Data;

@Data
public class RecipeDto {

    private String title;
    private String description;
    private int steps;
    private String created_date;



}
