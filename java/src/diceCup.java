import java.util.Scanner;

public class diceCup {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int diceOne = scanner.nextInt();
        int diceTwo = scanner.nextInt();

        int[] arr = new int[1000];

        for(int i = 1; i <= diceOne; i++){
            for(int j = 1; j <= diceTwo; j++){
                arr[i+j]++;
            }
        }

        int max = 0;
        int n = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                n = i;

            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                System.out.println(i);
            }
        }
    }
}
