import java.util.Scanner;

public class quickEstimates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < cases; i++){
            System.out.println(scanner.nextLine().length());
        }
        scanner.close();
    }
}
