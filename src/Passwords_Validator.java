import java.util.Arrays;

public class Passwords_Validator {
    public static void main(String[] args) {
        String pass = "abrBdb1";
        String [] arr = pass.split("");

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";
        boolean valid = pass.matches(regex);
        System.out.println(valid);
    }
}
