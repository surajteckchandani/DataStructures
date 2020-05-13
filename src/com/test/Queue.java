package com.test;

/**
 * @author Suraj Tekchandani
 */
public class Queue {

    private int front= -1, rear=-1, max = 10;
    private int queue[] = new int[10];

    public void insert(int value){
        if (rear + 1 == max)
        {
            System.out.println("overflow");
        } else {
            if(front == -1 && rear == -1)
            {
                front = 0;
                rear = 0;
            }
            else
            {
                rear = rear + 1;
            }
            queue[rear]=value;
        }
    }

    public void display(){
        if(rear == -1) {
            System.out.println("Queue is empty");
        } else {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(queue[i]);
            }
        }
    }

    public void delete (){
        System.out.println("inside delete element");
        int value;
        if (front == -1 || front > rear)
        {
            System.out.println("underflow");
        } else {
            value = queue[front];
            if (front == rear){
                front = rear = -1;
            }else {
                front = front +1;
            }
            System.out.println(value);
        }

    }
}
