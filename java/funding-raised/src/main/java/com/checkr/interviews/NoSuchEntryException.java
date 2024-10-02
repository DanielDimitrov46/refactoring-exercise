package com.checkr.interviews;

public class NoSuchEntryException extends Exception {
    private String msg;

    public NoSuchEntryException(String error) {
        this.msg = error;
    }

    public String getMsg() {
        return msg;
    }
}
