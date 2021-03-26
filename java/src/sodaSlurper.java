import java.util.Scanner;

public class sodaSlurper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emptyBottles = scanner.nextInt() + scanner.nextInt();
        int recycleValue = scanner.nextInt();
        int total = 0;
        int newBottles = 0;

        while(emptyBottles >= recycleValue){
            newBottles = emptyBottles % recycleValue;
            emptyBottles /= recycleValue;
            total += emptyBottles;
            emptyBottles += newBottles;
        }
        System.out.println(total);
    }
}
