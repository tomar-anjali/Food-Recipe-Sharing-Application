package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.CategoryDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Category;
import org.springframework.http.ResponseEntity;

public interface CategoryServiceInterface {
    ResponseEntity<ResponseStructure<Category>> saveCategory(CategoryDto categoryDto, int recipeId);
}
