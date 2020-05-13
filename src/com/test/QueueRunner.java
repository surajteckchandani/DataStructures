package com.test;

/**
 * @author Suraj Tekchandani
 */
public class QueueRunner {

    public static void main(String[] args) {
        System.out.println("Queue Runner");
        Queue q = new Queue();
        q.insert(10);
        q.insert(1);
        q.insert(15);
        q.insert(12);
        q.insert(13);
        q.insert(15);
        q.insert(15);
        q.insert(15);
        q.insert(15);
        q.insert(10);


        q.display();

        q.delete();

        q.display();
    }
}
