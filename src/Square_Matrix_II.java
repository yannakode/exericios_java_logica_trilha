import java.util.Scanner;

public class Square_Matrix_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[][] arr = new int[n][n];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr[i][j] = i + j + 1;
                }
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.printf("%3d", arr[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
