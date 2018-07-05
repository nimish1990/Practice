package com.data.practice.patterns.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        //create subject
        MyTopicProducer topic = new MyTopicProducer();

        //create observers
        Observer obj1 = new MyTopicConsumer("Obj1");
        Observer obj2 = new MyTopicConsumer("Obj2");
        Observer obj3 = new MyTopicConsumer("Obj3");
        Observer obj4 = new MyTopicConsumer("Obj4");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("New Message");

        topic.register(obj4);
        obj4.setSubject(topic);


    }
}
