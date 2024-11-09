package com.ats.Food_Recipe_Sharing_Application.dao;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Users;
import com.ats.Food_Recipe_Sharing_Application.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDaoImpl implements UsersDao
{
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users createUsers(Users users) {
        return usersRepository.save(users);
    }
}
