package com.ats.Food_Recipe_Sharing_Application.controller;


import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.RecipeDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Recipe;
import com.ats.Food_Recipe_Sharing_Application.repository.RecipeRepository;
import com.ats.Food_Recipe_Sharing_Application.service.RecipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/recipe")
public class RecipeController {
   @Autowired
    public RecipeServiceInterface recipeService;
@PostMapping ("/save")
    ResponseEntity <ResponseStructure<Recipe>> createRecipe(@RequestBody RecipeDto recipedto){
    return RecipeServiceInterface.createRecipe(recipedto);
}


}
