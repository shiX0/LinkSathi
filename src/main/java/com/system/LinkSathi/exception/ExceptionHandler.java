package com.system.LinkSathi.exception;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleMethodArgsNotValid(MethodArgumentNotValidException methodArgumentNotValidException){
        methodArgumentNotValidException.printStackTrace();
        return "error handles";
    }
}
