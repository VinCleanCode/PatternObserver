package com.rp.pattern.observer.adventurer;

public abstract class Adventurer {
    String name;

    public Adventurer(String name){
        this.name = name;
    }

    public abstract void getQuestions(String questions);
}
