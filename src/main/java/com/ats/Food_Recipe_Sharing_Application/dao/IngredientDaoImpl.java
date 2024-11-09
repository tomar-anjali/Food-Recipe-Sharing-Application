package com.ats.Food_Recipe_Sharing_Application.dao;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Ingredients;
import com.ats.Food_Recipe_Sharing_Application.repository.IngredientRepository;

import org.springframework.stereotype.Repository;

@Repository
public class IngredientDaoImpl implements IngredientDao{

    private IngredientRepository ingredientRepository;

    @Override
    public Ingredients createIngredient(Ingredients ingredients) {
       return ingredientRepository.save(ingredients);
    }
}
