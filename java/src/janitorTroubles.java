import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;


public class janitorTroubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.######");

        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int s4 = scanner.nextInt();
        double s = (double) (s1 + s2 + s3 + s4) / 2;
        double maxArea = Math.sqrt((s - s1) * (s - s2) * (s - s3) * (s - s4));
        System.out.println(df.format(maxArea));
    }
}
