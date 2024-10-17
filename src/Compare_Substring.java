import java.util.*;
import java.util.stream.Collectors;

public class Compare_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first word");
        String a = sc.nextLine();
        System.out.println("Type the second word");
        String b = sc.nextLine();
        String[] p1 = getSubstrings(a);
        String[] p2 = getSubstrings(b);

        System.out.println(compare(p1, p2));
    }
    public static String[] getSubstrings(String str) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                arr.add(str.substring(i, j));
            }
        }
        return arr.toArray(new String[0]);
    }
    public static int compare(String[] a, String[] b) {
        List<String> commomSubs = Arrays.stream(a)
                .filter(e -> Arrays.asList(b).contains(e))
                .toList();

        String greater = commomSubs.stream()
                .max((s1,s2) -> Integer.compare(s1.length(), s2.length())).orElse("");
        return greater.length();
    }
}
