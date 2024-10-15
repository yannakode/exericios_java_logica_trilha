import java.time.Duration;
import java.util.Scanner;
public class Time_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        time_conversion(seconds);
    }
    public static void time_conversion(int seconds){
        Duration duration = Duration.ofSeconds(seconds);
        int h = duration.toHoursPart();
        int m = duration.toMinutesPart();
        int s = duration.toSecondsPart();
        System.out.println(h + ":" + m + ":" + s);
    }
}
