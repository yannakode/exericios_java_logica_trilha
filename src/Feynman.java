import java.util.Scanner;

public class Feynman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int totalSquares = 0;
            for (int i = 1; i <= n; i++) {
                totalSquares += i * i;
            }

            System.out.println(totalSquares);
        }

        sc.close();

    }
}