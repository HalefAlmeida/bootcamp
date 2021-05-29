package com.project.bootcamp.exceptions;

/**
 * Trata as exceções da aplicação
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String message){
        super(message);
    }
}
