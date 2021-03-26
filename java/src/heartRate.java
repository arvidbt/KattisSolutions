import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class heartRate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);

        for(int i = 0; i < iterations; i++){
            float b = scanner.nextFloat();
            float p = scanner.nextFloat();

            float bpm = (60*b) / p;
            float abpm = bpm - (60/p);
            float max = bpm + (60/p);

            System.out.println(df.format(abpm) + " " + df.format(bpm) + " " + df.format(max));
        }
    }
}
