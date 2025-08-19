package com.app.user.service.exception;

public class ResourceConflictException extends GlobalException{

   
    public ResourceConflictException() {
        super("Resource already present on the server!!!");
    }

   
    public ResourceConflictException(String message) {
        super(message);
    }
}
