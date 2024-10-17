import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hidden_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> phrases = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            phrases.add(a);
        }

        for (String p : phrases) {
            System.out.println(spliptString(p));
        }
    }
    public static StringBuilder spliptString(String str){
        String[] arr = str.split("[^a-zA-Z]+");
        StringBuilder firstletters = new StringBuilder(new String());
        for(String s : arr){
            if(s.length()>0){
                firstletters.append(s.substring(0, 1));
            }
        }
        return firstletters;
    }
}
