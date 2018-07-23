package com.data.practice.patterns.factory;

public enum ComputerType {
    PC("PC"),
    SERVER("SERVER");

    private String value;

    ComputerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
