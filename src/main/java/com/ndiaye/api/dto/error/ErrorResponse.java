package com.ndiaye.api.dto.error;

import java.util.Date;

public class ErrorResponse {

    private int code;
    private String message;
    private Date timestamp;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public ErrorResponse() {
    }

    public ErrorResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ErrorResponse(int code, String message, Date timestamp) {
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
