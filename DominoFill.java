// Codeforces Problem 50A - Domino Filling

import java.util.Scanner;

public class DominoFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        //logic is ans = (m*n)//2
        int temp = (m*n);
        System.out.println(Math.floorDiv(temp, 2));
        sc.close();
    }
}
