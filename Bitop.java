// Codeforces Problem 282A - Bit ++

import java.util.Scanner;

public class Bitop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        sc.nextLine();
        int x = 0;
        for(int i=0;i<inputs;i++){
            String s = sc.nextLine();
            if(s.contains("+")){
                x += 1;
            }else{
                x-=1;
            }
        }

        System.out.println(x);

        sc.close();
    }
}
