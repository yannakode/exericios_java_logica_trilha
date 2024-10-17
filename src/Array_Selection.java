import java.util.Random;

public class Array_Selection {
    public static void main(String[] args) {
        double[] arr = new double[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            double randomNumber = (random.nextDouble() * 20) - 10;
            arr[i] = Math.round(randomNumber * 10) / 10.0;
            System.out.println("A[" + i + "] = " + arr[i]);
        }

    }
}
