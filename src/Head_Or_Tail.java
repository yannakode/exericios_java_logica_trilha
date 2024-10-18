import java.util.Random;
import java.util.Scanner;

public class Head_Or_Tail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int mary = 0;
            int john = 0;
            int n = sc.nextInt();
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                int result = sc.nextInt();
                if (result == 0) {
                    mary++;
                } else {
                    john++;
                }
            }
        System.out.println("Mary won " + mary  + " times and bob won " + john + " times");
    }
}
}
