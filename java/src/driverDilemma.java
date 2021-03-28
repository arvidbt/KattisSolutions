import java.util.Scanner;

public class driverDilemma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float capacity = scanner.nextFloat(); // Total in tank
        float fuelLeak = scanner.nextFloat(); // Fuel leaked per hour
        float distance = scanner.nextFloat(); // Distance to nearest gas station.
        int vroom = 0;

        for(int i = 0; i < 6; i++){
            int speed = scanner.nextInt();
            float efficiency = scanner.nextFloat();
            float fuel = (distance / efficiency) + (distance / speed) * fuelLeak;

            if(fuel - (capacity/2) <= 0){
                vroom = speed;
            }
        }
        if(vroom != 0){
            System.out.println("YES " + vroom);
        }
        else {
            System.out.println("NO");
        }
    }
}
