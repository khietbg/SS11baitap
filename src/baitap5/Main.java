package baitap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi can kiem tra");
        String string = scanner.nextLine();
        System.out.println("ket qua la "+MyTest.testString(string));

    }
    public class MyTest{

       static Stack<Character> stack = new Stack<>();
       static Queue<Character> queue = new LinkedList<>();
        public static boolean testString(String string){
            for (int i = 0; i < string.length(); i++) {
                stack.push(string.charAt(i));
                queue.add(string.charAt(i));
            }
            for (int i = 0; i < string.length(); i++) {
                if (stack.pop() != queue.poll()){
                    return false;
                }

            }return true;
        }

    }
}
