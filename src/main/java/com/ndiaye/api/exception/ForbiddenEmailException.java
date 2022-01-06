package com.ndiaye.api.exception;

public class ForbiddenEmailException extends RuntimeException {
    public ForbiddenEmailException(String message) {
        super(message);
    }
}
