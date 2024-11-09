package com.ats.Food_Recipe_Sharing_Application.repository;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {
}
