package com.ats.Food_Recipe_Sharing_Application.datamodels.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_id")
    @SequenceGenerator(initialValue = 101, name="user_id",allocationSize = 1)
    private int id;
    private String name;
    private String email;
    private String place;
    @OneToMany(mappedBy = "users")
    private List<Recipe> recipes;

}
