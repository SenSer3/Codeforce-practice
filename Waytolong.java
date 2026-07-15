// Codeforces Problem 71A - Way To Long 
// "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".
import java.util.Scanner;

public class Waytolong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = sc.nextLine();
        }
        for (String word : words) {
            if (word.length() > 10) {
                String result = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(result);
            } else {
                System.out.println(word);
            }

        }

        sc.close();
    }
}
