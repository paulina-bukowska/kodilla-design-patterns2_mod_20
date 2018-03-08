package com.kodilla.patterns2.observer.forum;

// interfejs, który musi być implementowany przez ForumTopic
// po to, aby obserwatorzy mogli się subskrybować na zmiany w obiektach tej klasy.
public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
