package com.ats.Food_Recipe_Sharing_Application.dao;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Recipe;
import com.ats.Food_Recipe_Sharing_Application.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecipeDaoImpl implements RecipeDao {
 @Autowired
    private RecipeRepository recipeRepository;

@Override
public Recipe createRecipe(Recipe recipe){
    return recipeRepository.save(recipe);
}



}
