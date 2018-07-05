package com.data.practice.patterns.observer;

public interface Observer {
    void setSubject(Subject sub);

    void update();
}
