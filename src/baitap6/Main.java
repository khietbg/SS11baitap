package baitap6;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] expression = {"s * (s – a) * (s – b) * (s – c)",
                "(– b + (b2 – 4*a*c)^0.5) / 2*a",
                "s * (s – a) * (s – b * (s – c)",
                "s * (s – a) * s – b) * (s – c)"};
        Stack<Character> left;
        Stack<Character> right;
        for (String s:expression) {
            left = new Stack<>();
            right = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==')'){
                    left.push(s.charAt(i));
                }else if (s.charAt(i)=='('){
                    right.push(s.charAt(i));
                }

            }
            if (left.size()==right.size()){
                System.out.println("la bieu thuc dung");
            }else {
                System.out.println("la bieu thuc sai");
            }

        }

    }
}
