package com.ats.Food_Recipe_Sharing_Application.dao;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Rating;

public interface RatingDao {
    Rating saveRating(Rating rating);
}