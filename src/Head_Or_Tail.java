import java.util.Random;
import java.util.Scanner;

public class Head_Or_Tail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        int mary = 0;
        int bob = 0;

        for (int i = 1; i <= n; i++) {
            int temp = random.nextInt(2);
            if (temp == 0) {
                mary++;
            } else{
                bob++;
            }
        }
        System.out.println("Mary won " + mary  + " times and bob won " + bob + " times");
    }
}
