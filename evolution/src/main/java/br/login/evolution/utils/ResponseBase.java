package br.login.evolution.utils;

public class ResponseBase<T> {

    private String message;

    private boolean success;

    private T data;

    public ResponseBase() { }

    public ResponseBase(T data, String message, boolean success) {
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public ResponseBase<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public ResponseBase<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseBase<T> setData(T data) {
        this.data = data;
        return this;
    }

}
