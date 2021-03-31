import java.util.Scanner;

public class provinceOrGold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gold = scanner.nextInt();
        int silver = scanner.nextInt();
        int copper = scanner.nextInt();

        int goldBuyingPower = 3;
        int silverBuyingPower = 2;
        int copperBuyingPower = 1;

        int handValue = 0;

        for(int i = 0; i < gold; i++){
            handValue += goldBuyingPower;
        }
        for(int i = 0; i < silver; i++){
            handValue += silverBuyingPower;
        }
        for(int i = 0; i < copper; i++){
            handValue += copperBuyingPower;
        }

        if(handValue >= 8){
            System.out.println("Province or Gold");
        }
        else if(handValue >= 6){
            System.out.println("Duchy or Gold");
        }
        else if(handValue >= 5){
            System.out.println("Duchy or Silver");
        }
        else if(handValue >= 3){
            System.out.println("Estate or Silver");
        }
        else if(handValue >= 2){
            System.out.println("Estate or Copper");
        }
        else{
            System.out.println("Copper");
        }
    }
}
