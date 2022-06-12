package com.bridgelabz.user_service.exception;

import lombok.Data;

@Data
public class BookStoreException extends RuntimeException {
    public BookStoreException(String message) {
        super(message);
    }
}
