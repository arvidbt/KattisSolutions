import java.util.Scanner;
import java.lang.Math;

public class sibice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int NumMatches = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int sideways = (int)Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        for(int i = 0; i < NumMatches; i++){
            int stick = scanner.nextInt();

            if(stick > width && stick > height && stick > sideways){
                System.out.println("NE");
            }

            else{
                System.out.println("DA");
            }
        }
    }
}
