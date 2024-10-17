import java.util.Arrays;

public class Letter_Frequency {
    public static void main(String[] args) {
        String str = "Computers account for only 5% of the country's commercial electricity consumption.";
        String[] arr = new String[str.length()];

        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                arr[i] = str.substring(i, j);
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
