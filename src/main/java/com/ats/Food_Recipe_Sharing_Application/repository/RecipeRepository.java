package com.ats.Food_Recipe_Sharing_Application.repository;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Integer> {

}
