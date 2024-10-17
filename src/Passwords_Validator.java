import java.util.Arrays;
import java.util.Scanner;

public class Passwords_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,32}$";
        boolean valid = pass.matches(regex);
        System.out.println(valid);
    }
}
