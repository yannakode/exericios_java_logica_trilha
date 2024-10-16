import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Array_Fill_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        if(n < 2 || n > 50){
            System.out.println("number must be between 2 and 50");
            return;
        }
        int[] arr = new int[1000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i % n;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println("N[" + i + "] = " + arr[i]);
        }
    }
}
