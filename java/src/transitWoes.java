import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class transitWoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int totalTime = 0;
        List<Integer> walks = new ArrayList<>();
        List<Integer> rides = new ArrayList<>();
        List<Integer> departures = new ArrayList<>();

        for(int i = 0; i < n + 1; i++){
            walks.add(scanner.nextInt());
        }
        totalTime = s + walks.get(0);

        for(int i = 0; i < n; i++){
            rides.add(scanner.nextInt());
        }

        for(int i = 0;i < n; i++){
            departures.add(scanner.nextInt());
        }

        for(int i = 0; i < n; i++){
            int isLate = totalTime % departures.get(i);
            if(isLate == 0){
                totalTime += isLate;
            }
            else{
                totalTime += departures.get(i) - isLate;
            }
            totalTime += walks.get(i) + rides.get(i);
        }
        if(totalTime <= t){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
