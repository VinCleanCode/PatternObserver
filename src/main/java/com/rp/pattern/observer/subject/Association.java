package com.rp.pattern.observer.subject;

public class Association extends Subject{
    public void sendQuestions(final String questions) {
        list.stream().forEach(adventurer ->  adventurer.getQuestions(questions));
    }
}
