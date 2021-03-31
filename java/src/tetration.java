import java.util.Scanner;

public class tetration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        System.out.println(Math.pow(n, 1/n));
    }
}
