package com.kodilla.patterns2.observer.homework;

public class Teacher implements ObserverHomework {
    private final String name;
    private final String lastName;
    private int updateCount;

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public void update(AssignmentTopic assignmentTopic) {
        System.out.println(toString() + ": new assignment in topic \"" + assignmentTopic.getName() + "\" from: " +
                assignmentTopic.getStudent() + " awaiting for checking" + "\n(total: " + assignmentTopic.getAssignments().size() + " assignments)");
        updateCount++;
    }
}
