package com.ats.Food_Recipe_Sharing_Application.dao;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Category;
import com.ats.Food_Recipe_Sharing_Application.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
