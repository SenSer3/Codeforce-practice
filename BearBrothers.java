// Codeforces Problem 791A - Bear brothers

import java.util.Scanner;

public class BearBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while(a<=b){
            a= a*3;
            b= b*2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
    
}
