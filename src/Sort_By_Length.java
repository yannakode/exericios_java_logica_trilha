import java.util.Arrays;
import java.util.Scanner;
public class Sort_By_Length {
    public static void main(String[] args) {
        String words = "Top Coder comp Wedn at midnight";
        sort(words);
    }
    public static void sort(String word) {
        String[] words = word.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() < words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        Arrays.stream(words).forEach(System.out::println);
    }
}
