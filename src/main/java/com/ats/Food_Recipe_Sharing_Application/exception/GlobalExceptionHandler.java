package com.ats.Food_Recipe_Sharing_Application.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(DataNotFound.class)
    public ResponseEntity dataNotExist(DataNotFound d){
    return ResponseEntity.badRequest().body(d.getMessage());
}
}
