package org.codingdojo.kata;

public record Employee(String name, int age) {

    public boolean isAdult() {
        return age >= 18;
    }
}
