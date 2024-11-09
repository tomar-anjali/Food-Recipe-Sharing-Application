package com.ats.Food_Recipe_Sharing_Application.controller;

import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.UsersDto;
import com.ats.Food_Recipe_Sharing_Application.service.UsersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UsersController
{
    @Autowired
    private UsersServiceInterface usersServiceInterface;

    @PostMapping("/save")
    public ResponseEntity<ResponseStructure<Users>> createUsers( UsersDto usersDto)
    {
        return usersServiceInterface.createUsers(usersDto);
    }

}
