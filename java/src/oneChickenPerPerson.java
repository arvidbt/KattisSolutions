import java.util.Scanner;

public class oneChickenPerPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = scanner.nextInt();
        int chickens = scanner.nextInt();

        if(chickens > guests){
            int ate = chickens - guests;

            if(ate == 1){
                System.out.println("Dr. Chaz will have " + ate + " piece of chicken left over!");

            }
            else {
                System.out.println("Dr. Chaz will have " + ate +" pieces of chicken left over!");
            }
        }
        else{
            int left = guests - chickens;

            if(left == 1){
                System.out.println("Dr. Chaz needs " + left + " more piece of chicken!");
            }
            else{
                System.out.println("Dr. Chaz needs " + left + " more pieces of chicken!");

            }
        }
    }
}
