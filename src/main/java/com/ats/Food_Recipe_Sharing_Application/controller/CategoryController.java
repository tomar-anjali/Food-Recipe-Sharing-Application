package com.ats.Food_Recipe_Sharing_Application.controller;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.CategoryDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Category;
import com.ats.Food_Recipe_Sharing_Application.service.CategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceInterface categoryService;
    @PostMapping("/save/{recipeId}")
    public ResponseEntity<ResponseStructure<Category>> createHospital(@RequestBody CategoryDto categoryDto , @PathVariable int recipeId){
        return categoryService.saveCategory(categoryDto, recipeId);
    }
}
