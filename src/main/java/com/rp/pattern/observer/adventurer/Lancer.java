package com.rp.pattern.observer.adventurer;

public class Lancer extends Adventurer{
    public Lancer(String name) {
        super(name);
    }

    public void getQuestions(String questions) {
        System.out.println(name+": get ticket, take task");
    }
}
