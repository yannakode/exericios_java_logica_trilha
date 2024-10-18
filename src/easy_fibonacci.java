import java.util.Arrays;
import java.util.Scanner;

public class easy_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            if(i  == 0){
                arr[i] = 0;
            }else if(i == 1 || i == 2){
                arr[i] = 1;
            }
            if (i > 2){
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        for (int i = 0; i < n; i++) {
            if(i == n - 1){
                System.out.print(arr[i]);
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

