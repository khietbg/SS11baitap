package baitap3;

import java.util.StringJoiner;

public class Queue {
    private Node front;
    private Node rear;
    public Queue(Node data ){
        front = new Node(data);
    }
    public Queue(){

    }
    public void enqueue(int data){
       Node node = new Node(data);
        if (front == null){
        front = rear = node;
        }else {
            rear.link = node;
            rear = node;
        }
    }
    public void dequeue(){
        if (front!=null)
            System.out.println(front);
        front = front.link;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Queue.class.getSimpleName() + "[", "]")
                .add("front=" + front)
                .add("rear=" + rear)
                .toString();
    }
}
