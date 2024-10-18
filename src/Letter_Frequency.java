import java.util.Arrays;
import java.util.Scanner;

public class Letter_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().toLowerCase();
            int[] freq = new int[26];
            for(char c : s.toCharArray()) {
                if(Character.isLetter(c)) {
                    freq[c - 'a']++;
                }
            }
            int max = Arrays.stream(freq).max().getAsInt();
            StringBuilder result = new StringBuilder();

            for(int j = 0; j < 26; j++) {
                if(freq[j] == max) {
                    result.append((char) (j + 'a'));
                }
            }
            System.out.println(result.toString());
        }


    }
}
