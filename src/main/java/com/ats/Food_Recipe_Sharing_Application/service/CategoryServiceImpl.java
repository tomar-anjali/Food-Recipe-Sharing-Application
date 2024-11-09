package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.dao.CategoryDao;
import com.ats.Food_Recipe_Sharing_Application.dao.RecipeDao;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.CategoryDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Category;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryServiceInterface{
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private RecipeDao recipeDao;
    @Override
    public ResponseEntity<ResponseStructure<Category>> saveCategory(CategoryDto categoryDto, int recipeId) {
        Recipe foundRecipe = recipeDao.fetchBy(recipeId);
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setRecipes((List<Recipe>) foundRecipe);
        category.setName(categoryDto.getName());
        ResponseStructure<Category> responseStructure = new ResponseStructure<>();
        responseStructure.setData(categoryDao.saveCategory(category));
        responseStructure.setMessage("Category Created");
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
    }
}
