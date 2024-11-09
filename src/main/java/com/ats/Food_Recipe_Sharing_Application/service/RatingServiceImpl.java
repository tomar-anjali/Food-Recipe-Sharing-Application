package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.RatingDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingServiceInterface{

    @Autowired
    private RatingDao ratingDao;

    @Override
    public ResponseEntity<ResponseStructure<Rating>> saveRating(RatingDto ratingDto) {

        Rating rating = new Rating();
        rating.setComment(ratingDto.getComment());

        Rating rating1 = ratingDao.saveRating(rating1);

        ResponseStructure<Rating> responseStructure = new ResponseStructure<>();
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        responseStructure.setMessage("Hospital created");
        responseStructure.setData(rating1);

        return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
    }
}
