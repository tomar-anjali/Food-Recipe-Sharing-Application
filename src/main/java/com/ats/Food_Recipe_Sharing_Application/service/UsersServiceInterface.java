package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.UsersDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Users;
import org.springframework.http.ResponseEntity;

public interface UsersServiceInterface
{
    ResponseEntity<ResponseStructure<Users>> createUsers(UsersDto usersDto);

}
