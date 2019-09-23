package com.rp.pattern.observer.subject;

import com.rp.pattern.observer.adventurer.Adventurer;
import com.rp.pattern.observer.adventurer.Bard;
import com.rp.pattern.observer.adventurer.Gunman;
import com.rp.pattern.observer.adventurer.Lancer;
import org.junit.jupiter.api.Test;

class AssociationTest {

    @Test
    void testSendQuestions() {
        System.out.println("================= Observer pattern test ================= ");

        Adventurer lancer = new Lancer("jacky");
        Adventurer lancer2 = new Lancer("seven");
        Adventurer bard = new Bard("lee");
        Adventurer gunman = new Gunman("longWu");

        Subject association = new Association();
        association.add(lancer);
        association.add(lancer2);
        association.add(bard);
        association.add(gunman);

        System.out.println("----- association send simple task ------");
        association.sendQuestions("run");

        System.out.println();
        System.out.println("----- association send hard task ------");
        association.sendQuestions("run hard task. Only good can take that.");

        association.remove(lancer);
        System.out.println();
        System.out.println("----- Again association send hard task ------ Again");
        association.sendQuestions("run 2nd hard task. I mean hard one");

        System.out.println("\nNote: Check -- Who is missing ?? ");
        System.out.println("================= Observer pattern test ================= ");
    }
}