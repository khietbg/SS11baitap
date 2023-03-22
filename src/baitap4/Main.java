package baitap4;

import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. chuyen qua he nhi phan");
            System.out.println("2 chuyen qua he thap thuc phan");
            System.out.println("3. exit");
            System.out.println("nhap lua chon cua ban: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap so ban muon chuyen: ");
                    int num = scanner.nextInt();
                    Convert10To2.convertwith2(num);
                    break;
                case 2:
                    System.out.println("nhap so ban muon chuyen: ");
                    int num1 = scanner.nextInt();
                    Convert10To2.converttwith16(num1);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }

        }
    }

    public class Convert10To2 {
        static Stack<Integer> stack = new Stack<>();

        public static void convertwith2(int num) {
            while (num != 0) {
                int a = num % 2;
                stack.push(a);
                num /= 2;
            }
            System.out.println("ma nhi phan la");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }

        public static void converttwith16(int num) {
            while (num != 0) {
                int b = num % 16;
                stack.push(b);
                num /= 16;
            }
            System.out.println("ma thap luc phan la");
            while (!stack.isEmpty()) {
                int tempValue = stack.pop();
                if (tempValue >= 10) {
                    switch (tempValue) {
                        case 10:
                            System.out.print("A ");
                            break;
                        case 11:
                            System.out.print("B ");
                            break;
                        case 12:
                            System.out.print("C ");
                            break;
                        case 13:
                            System.out.print("D ");
                            break;
                        case 15:
                            System.out.print("E ");
                            break;
                        case 16:
                            System.out.print("F ");
                            break;
                        default:
                            break;
                    }
                    System.out.print(tempValue + " ");
                }
            }
            System.out.println();
        }
    }
}
