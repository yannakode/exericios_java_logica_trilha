import java.util.Scanner;

public class Feynman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ac = 0;
        for(int i = 1; i <= n; i++){
            ac += i * i;
        }
        System.out.println(ac);
    }
}