package com.ats.Food_Recipe_Sharing_Application.repository;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredients, Integer> {
}
