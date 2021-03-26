import java.util.Scanner;
import java.lang.Math;

public class abc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int first_int = scanner.nextInt();
        int second_int = scanner.nextInt();
        int third_int = scanner.nextInt();

        int large1 = Math.max(first_int, second_int);
        int large2 = Math.max(large1, third_int);

        int small1 = Math.min(first_int, second_int);
        int small2 = Math.min(small1, third_int);

        int medium = (first_int + second_int + third_int) - (small2 + large2);

        Scanner scanner1 = new Scanner(System.in);
        String letters = scanner1.nextLine();

        if(letters.equals("ABC")){
            System.out.println(small2 + " " + medium + " " + large2);
        }
        if(letters.equals("ACB")){
            System.out.println(small2 + " " + large2 + " " + medium);
        }
        if (letters.equals("BAC")){
            System.out.println(medium + " " + small2 + " " + large2);
        }
        if (letters.equals("BCA")){
            System.out.println(medium + " " + large2 + " " + small2);
        }
        if (letters.equals("CBA")){
            System.out.println(large2 + " " + medium + " " + small2);
        }
        if (letters.equals("CAB")){
            System.out.println(large2 + " " + small2 + " " + medium);
        }
        scanner.close();
        scanner1.close();
    }
}
