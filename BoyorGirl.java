// Codeforces Problem 236A - Boy or Girl

import java.util.LinkedHashSet;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        sb.toString();
        if(sb.length()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
