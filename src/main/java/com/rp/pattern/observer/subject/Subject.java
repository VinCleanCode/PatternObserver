package com.rp.pattern.observer.subject;

import com.rp.pattern.observer.adventurer.Adventurer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Adventurer> list = new ArrayList();

    public void add(Adventurer observer){
        list.add(observer);
    }

    public void remove(Adventurer observer){
        list.remove(observer);
    }

    public abstract void sendQuestions(String questions);
}
