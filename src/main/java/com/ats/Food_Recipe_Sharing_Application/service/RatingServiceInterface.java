package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.RatingDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import org.springframework.http.ResponseEntity;

public interface RatingServiceInterface {
    ResponseEntity<ResponseStructure<Rating>> saveRating(RatingDto ratingDto );

}
