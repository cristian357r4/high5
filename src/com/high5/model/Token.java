package com.high5.model;

public class Token {
    private String key;
    private String value;

    public Token(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getToken() {
        return "<" + this.key + ", " + this.value + ">";
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
}