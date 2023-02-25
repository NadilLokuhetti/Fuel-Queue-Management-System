package com.example.task04;

public class CircularQueue {
    int size = 10;
    passenger[] List = new passenger[size];

    int front;
    int rear;

    public CircularQueue(){
        front=-1;
        rear=-1;
    }
    public boolean isFull(){
        if(front==0 && rear== size - 1){
            return true;
        }
        if (front==rear+1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front== -1){
            return true;
        }else {
            return false;
        }
    }

    public void enQueue(passenger element){
        if (isFull()){
            System.out.println("The waiting Queue is full");
        }else {
            if(front==-1){
                front = 0;
            }
            rear=(rear + 1) % size;
            List[rear] = element;
        }
    }

    public passenger deQueue(){
        passenger element;
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return null;
        }else {
            element= List[front];
            if (front == rear){
                front = -1;
                rear = -1;
            }else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }
}
