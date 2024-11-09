package com.ats.Food_Recipe_Sharing_Application.datamodels.entity;

<<<<<<< HEAD:src/main/java/com/ats/Food_Recipe_Sharing_Application/datamodels/entity/Ingredients.java
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ,generator = "ingredients_id")
    @SequenceGenerator(initialValue = 501,name = "ingredients_id",allocationSize = 1)
    private int ingredientsId;
    private String ingredientsName;
    private int quantity;
    private int unit;
    private double price;

=======
public class Ingredient {
>>>>>>> fe005bdca1c65f232e51459882fce96a97e8d472:src/main/java/com/ats/Food_Recipe_Sharing_Application/datamodels/entity/Ingredient.java
}
