package baitap3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Queue queque= new Queue();
        queque.enqueue(2);
        queque.enqueue(2);
        queque.enqueue(2);
        System.out.println(queque);
        queque.dequeue();
        System.out.println(queque);
    }
}
