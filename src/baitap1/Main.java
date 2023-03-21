package baitap1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      MyStack stack = new MyStack(5);
        System.out.println(stack.getSize());
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.push(6);
        System.out.println(stack);
      System.out.println(Arrays.toString(stack.reverse()));


    }

}