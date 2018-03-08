package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AssignmentTopic implements ObservableHomework {
    private final String name;
    private final Student student;
    private final List<ObserverHomework> observers;
    private final Deque<String> assignments;

    public AssignmentTopic(String name, Student student) {
        observers = new ArrayList<>();
        assignments = new ArrayDeque<>();
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public Deque<String> getAssignments() {
        return assignments;
    }

    public void addAssignment(String assignment) {
        assignments.offer(assignment);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomework observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverHomework observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomework observer) {
        observers.remove(observer);
    }
}
