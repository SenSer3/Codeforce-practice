// Codeforces Problem 50A - Helpful Maths

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] val = s.split("\\+");
        Arrays.sort(val);
        System.out.println(String.join("+", val));
        sc.close();
    }
}
