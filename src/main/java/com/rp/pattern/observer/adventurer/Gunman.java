package com.rp.pattern.observer.adventurer;

public class Gunman extends Adventurer {
    public Gunman(String name) {
        super(name);
    }

    public void getQuestions(String questions) {
        if(questions.length() <10){
            System.out.println(name+": Too easy for me. I don't want to take this task");
        }else{
            System.out.println(name+": take this task !!");
        }
    }
}
