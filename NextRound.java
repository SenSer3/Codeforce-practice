// Codeforces Problem 158A - Next Round
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] scores = new int[n];
        for(int i=0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        int cuttoff = scores[k-1]; 
        int count=0;
        for (int i : scores) {
            if(i>=cuttoff && i>0){
                count++;
            }
        }
        System.err.println(count);
        sc.close();
    }
}
