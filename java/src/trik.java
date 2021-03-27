import java.util.Scanner;
import java.lang.String;

public class trik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();

        int ballPosition = 0;

        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'A' && ballPosition != 2){
                ballPosition = 1 - ballPosition;
            }
            if(moves.charAt(i) == 'B' && ballPosition != 0){
                ballPosition = -ballPosition + 3;
            }
            if(moves.charAt(i) == 'C' && ballPosition != 1){
                ballPosition = -ballPosition + 2;
            }
        }
        System.out.println(ballPosition + 1);
    }
}
