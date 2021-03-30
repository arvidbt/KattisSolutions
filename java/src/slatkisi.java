import java.util.Scanner;

public class slatkisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfCandy = scanner.nextDouble();
        double numberOfZeros = scanner.nextDouble();
        int toPay = (int)(Math.round(priceOfCandy / Math.pow(10, numberOfZeros)) * Math.pow(10, numberOfZeros));

        System.out.println(toPay);
    }
}
