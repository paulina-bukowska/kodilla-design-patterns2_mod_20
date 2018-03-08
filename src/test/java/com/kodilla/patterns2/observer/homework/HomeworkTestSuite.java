package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Teacher lindaKovalsky = new Teacher("Linda", "Kovalsky");
        Teacher morganWalsh = new Teacher("Morgan", "Walsh");
        Student madelynnCarson = new Student("Madelynn", "Carson");
        Student aimeeMurphy = new Student("Aimee", "Murphy");
        AssignmentTopic aspectsCarson = new AspectsTopic(madelynnCarson);
        AssignmentTopic collectionsCarson = new CollectionsTopic(madelynnCarson);
        AssignmentTopic aspectsMurphy = new AspectsTopic(aimeeMurphy);
        AssignmentTopic collectionsMurphy = new CollectionsTopic(aimeeMurphy);

        aspectsCarson.registerObserver(lindaKovalsky);
        aspectsMurphy.registerObserver(morganWalsh);
        collectionsCarson.registerObserver(lindaKovalsky);
        collectionsMurphy.registerObserver(morganWalsh);

        //When
        aspectsCarson.addAssignment("AspectJ execution");
        aspectsMurphy.addAssignment("AspectJ execution");
        aspectsMurphy.addAssignment("AspectJ args and target");
        collectionsCarson.addAssignment("List assignment");
        collectionsMurphy.addAssignment("Queue assignment");
        collectionsMurphy.addAssignment("Set assignment");

        //Then
        assertEquals(2, lindaKovalsky.getUpdateCount());
        assertEquals(4, morganWalsh.getUpdateCount());
    }
}
