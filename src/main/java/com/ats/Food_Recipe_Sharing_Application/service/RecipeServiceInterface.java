package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.RecipeDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Recipe;
import org.springframework.http.ResponseEntity;

public interface RecipeServiceInterface {
    ResponseEntity<ResponseStructure<Recipe>> createRecipe(RecipeDto recipeDto);
}
