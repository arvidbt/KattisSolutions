import java.util.Scanner;

public class mixedFractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

            if(numerator == 0 && denominator == 0){
                loop = false;
                System.exit(0);
            }

            int rest = numerator % denominator;
            int whole = (numerator - rest) / denominator;

            System.out.println(whole + " " + rest + " / " + denominator);
        }
    }
}
