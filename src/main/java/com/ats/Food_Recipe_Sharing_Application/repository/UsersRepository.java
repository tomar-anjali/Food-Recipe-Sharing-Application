package com.ats.Food_Recipe_Sharing_Application.repository;

import com.ats.Food_Recipe_Sharing_Application.datamodels.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>
{

}
