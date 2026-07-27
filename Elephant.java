// Codeforces Problem 617A - Elephant

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int steps = in/5;
        
        if(in%5 != 0){
            steps +=1;
        }
        System.out.println(steps);
        sc.close();
    }
}
