package com.ats.Food_Recipe_Sharing_Application.datamodels.dto;

import lombok.Data;

@Data
public class ResponseStructure<T> {
    private int status_code;
    private String message;
    private T data;

}
