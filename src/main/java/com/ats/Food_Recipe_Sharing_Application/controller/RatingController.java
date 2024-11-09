package com.ats.Food_Recipe_Sharing_Application.controller;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.RatingDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Rating;
import com.ats.Food_Recipe_Sharing_Application.service.RatingServiceImpl;
import com.ats.Food_Recipe_Sharing_Application.service.RatingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class RatingController {
    @Autowired
    private RatingServiceInterface ratingServiceInterface;
    @PostMapping("/save_rating")
    public ResponseEntity<ResponseStructure> saveRating(@RequestBody RatingDto ratingDto)
    {
        ResponseEntity<ResponseStructure<Rating>> data = ratingServiceInterface.saveRating(ratingDto);
        return data;
    }
}
