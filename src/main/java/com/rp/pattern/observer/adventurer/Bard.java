package com.rp.pattern.observer.adventurer;

public class Bard extends Adventurer{
    public Bard(String name) {
        super(name);
    }

    public void getQuestions(String questions) {
        if(questions.length() > 10 ){
            System.out.println(name+": task too hard for me. I only sing and dance. Don't want take task");
        }else{
            System.out.println(name+": take this task. I need make money");
        }
    }
}
