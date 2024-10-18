import java.util.Arrays;
import java.util.Scanner;

public class Passwords_Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String pass = sc.nextLine();
            String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)[a-zA-Z0-9]{6,32}$";

            boolean valid = pass.matches(regex);

            if (valid) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
