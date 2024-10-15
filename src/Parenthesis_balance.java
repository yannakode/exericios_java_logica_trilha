import java.util.Scanner;
public class Parenthesis_balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean value = parenthesis_balance(s);
        System.out.println(value);
    }
    public static boolean parenthesis_balance(String input) {
        int l = 0;
        int r = 0;
        if (input.startsWith(")") || input.endsWith("(")) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(') {
                r++;
            }
            if(input.charAt(i) == ')') {
                l++;
            }
        }
        int sum = l + r;
        return sum % 2 == 0;
    }
}
