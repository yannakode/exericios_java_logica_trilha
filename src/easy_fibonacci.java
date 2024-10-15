import java.util.Arrays;

public class easy_fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            if(i  == 0){
                arr[i] = 0;
            }else if(i == 1 || i == 2){
                arr[i] = 1;
            }
            if (i > 2){
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
