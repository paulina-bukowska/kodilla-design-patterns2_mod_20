package com.kodilla.patterns2.observer.forum;

// Jest to interfejs, który będzie implementowany przez każdego z obserwatorów (subskrybentów).
public interface Observer {
    void update(ForumTopic forumTopic);
}
