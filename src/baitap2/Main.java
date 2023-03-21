package baitap2;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (map.get(text.charAt(i)) == null){
                map.put(text.charAt(i), 1);
            } else {
                map.replace(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }
        System.out.println(map);
    }
}
