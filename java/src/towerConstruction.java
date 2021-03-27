import java.util.Scanner;

public class towerConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int towers = 0;
        int brick = 0;

        for(int i = 0; i < n; i++){
            int currentBrick = brick;
            brick = scanner.nextInt();
            if(currentBrick < brick){
                towers++;
            }
        }
        System.out.println(towers);
    }
}
