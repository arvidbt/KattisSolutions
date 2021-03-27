import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int megabytes = scanner.nextInt();
        int months = scanner.nextInt();
        int toSpend = megabytes * months;

        for(int i = 1; i <= months; i++){
            int spentMegabytes = scanner.nextInt();

            toSpend -= spentMegabytes;
        }
        System.out.println(toSpend + megabytes);
    }
}
