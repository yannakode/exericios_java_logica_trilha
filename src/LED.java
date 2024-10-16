import java.util.Scanner;
public class LED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de testes que deseja realizar:");
        int nTests = sc.nextInt();
        for (int i = 0; i < nTests; i++) {
            System.out.println("digite o número:");
            String num = sc.next();
            countLeds(num);
        }
    }
    public static void countLeds(String num){
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                count+= 6;
            }else if (num.charAt(i) == '1') {
                count+= 2;
            }else if (num.charAt(i) == '2') {
                count+= 5;
            }else if (num.charAt(i) == '3') {
                count+= 5;
            }else if (num.charAt(i) == '4') {
                count+= 4;
            }else if (num.charAt(i) == '5') {
                count+= 5;
            }else if (num.charAt(i) == '6') {
                count+= 6;
            }else if (num.charAt(i) == '7') {
                count+= 3;
            }else if (num.charAt(i) == '8') {
                count+= 7;
            }else if (num.charAt(i) == '9') {
                count+= 6;
            }
        }
        System.out.println(count);
    }
}
