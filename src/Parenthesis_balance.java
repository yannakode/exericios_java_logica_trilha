import java.util.Scanner;
public class Parenthesis_balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String result = parenthesis_balance(s);
            System.out.println(result);
        }
    }
    public static String parenthesis_balance(String input) {
        int temp = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                temp++;
            }
            if (c == ')') {
                temp--;
            }
            if(temp < 0) return "incorrect";
        }
        return temp == 0 ? "correct" : "incorrect";
    }
}
