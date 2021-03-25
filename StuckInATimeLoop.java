import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int spells = scan.nextInt();
        scan.close();

        for(int i = 1; i <= spells; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
