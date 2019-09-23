package com.rp.pattern.observer.subject;

import com.rp.pattern.observer.adventurer.Adventurer;

public class Association extends Subject{
    public void sendQuestions(final String questions) {
        list.stream().forEach(adventurer ->  adventurer.getQuestions(questions));
    }
}
