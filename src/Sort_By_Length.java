import java.util.Arrays;
import java.util.Scanner;

public class Sort_By_Length {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] sentences = new String[N];

        for (int i = 0; i < N; i++) {
            sentences[i] = scanner.nextLine();
        }

        for (String words : sentences) {
            sort(words);
        }
    }

    public static void sort(String wordsArr) {
        String[] words = wordsArr.split(" ");

        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(words[i]);
        }
        System.out.println();
    }
}
