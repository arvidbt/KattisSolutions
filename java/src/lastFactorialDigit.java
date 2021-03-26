import java.util.Scanner;

public class lastFactorialDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        int bigAssNumber = 1;

        for(int i = 0; i < cases; i++){
            int integer = scanner.nextInt();

            for(int j = 1; j <= integer; j++){
                bigAssNumber = bigAssNumber * j;
            }
            System.out.println(bigAssNumber % 10);
            bigAssNumber = 1;
        }
    }
}
