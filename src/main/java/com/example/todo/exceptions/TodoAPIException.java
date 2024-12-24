package com.example.todo.exceptions;

import org.springframework.http.HttpStatus;

public class TodoAPIException extends  RuntimeException {

    private HttpStatus status;
    private String message;

    public TodoAPIException(HttpStatus status, String message1) {
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
