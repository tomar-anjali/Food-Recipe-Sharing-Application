package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.dao.RecipeDao;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.RecipeDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RecipeServiceImpl implements RecipeServiceInterface {
@Autowired
private RecipeDao recipeDao;
    @Override
    public ResponseEntity<ResponseStructure<Recipe>> createRecipe(RecipeDto recipeDto) {
       Recipe recipe=new Recipe();
        recipe.setTitle(recipeDto.getTitle());
        ResponseStructure<Recipe>responseStructure=new ResponseStructure<Recipe>();
        responseStructure.setData(recipeDao.createRecipe(recipe));
        responseStructure.setMessage("recipe  Created");
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);

    }


    }

