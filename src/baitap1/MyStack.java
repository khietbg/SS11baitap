package baitap1;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;


    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index]=element;
        index++;

    }
    public boolean isFull(){
        if (size == index){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }
    public int getSize(){
        return this.size;
    }
   public int[] reverse(){
        int[] newArr = new int[arr.length];
       for (int i = arr.length-1; i >=0; i--) {
           newArr[arr.length-1-i]=arr[i];
       }
       return newArr;
   }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyStack.class.getSimpleName() + "[", "]")
                .add("arr=" + Arrays.toString(arr))
                .add("size=" + size)
                .add("index=" + index)
                .toString();
    }
}

