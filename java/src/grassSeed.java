import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class grassSeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.CEILING);

        float cost = scanner.nextFloat();
        int lawns = scanner.nextInt();
        float totalCost = 0;

        for(int i = 0; i < lawns; i++){
            float width = scanner.nextFloat();
            float length = scanner.nextFloat();

            float area = width * length;
            totalCost = totalCost + (area * cost);
        }
        System.out.println(totalCost);
    }
}
