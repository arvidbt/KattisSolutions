import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class planetaris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int solarSystems = scanner.nextInt();
        int spaceships = scanner.nextInt();
        int battlesWon = 0;
        List<Integer> enemies = new ArrayList<Integer>();

        for(int i = 0; i < solarSystems; i++){
            enemies.add(scanner.nextInt());
        }
        Collections.sort(enemies);
        for(int i = 0; i < solarSystems; i++) {
            if (spaceships > enemies.get(i)) {
                battlesWon++;
                spaceships -= enemies.get(i) + 1;
            }
        }
        System.out.println(battlesWon);
    }
}
