package com.ats.Food_Recipe_Sharing_Application.service;

import com.ats.Food_Recipe_Sharing_Application.dao.RecipeDao;
import com.ats.Food_Recipe_Sharing_Application.dao.UsersDao;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.ResponseStructure;
import com.ats.Food_Recipe_Sharing_Application.datamodels.dto.UsersDto;
import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersServiceInterface
{
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private RecipeDao recipeDao;

    @Override
    public ResponseEntity<ResponseStructure<Users>> createUsers(UsersDto usersDto)
    {
        Users users = new Users();
        users.setName(usersDto.getName());
        users.setEmail(usersDto.getEmail());
        users.setPlace(usersDto.getPlace());
        ResponseStructure<Users> responseStructure = new ResponseStructure();
        responseStructure.setData(usersDao.createUsers(users));
        responseStructure.setMessage("Users is created");
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
    }
}
