import java.util.Scanner;

public class roamingRomans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextFloat();
        double romanMiles = ((double)(1000 * 5280)/4854);

        System.out.println(Math.round(X *romanMiles));
    }
}
