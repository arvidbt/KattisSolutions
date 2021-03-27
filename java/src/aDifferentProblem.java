import java.util.Scanner;

public class aDifferentProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLong())
            System.out.println(Math.abs(scanner.nextLong() - scanner.nextLong()));
        scanner.close();
    }
}
