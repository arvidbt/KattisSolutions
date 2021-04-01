import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        int storesToVisit;

        for(int i = 0; i < testCases; i++){
            List<Integer> storesLoc = new ArrayList<>();
            storesToVisit = scanner.nextInt();
            for(int j = 0; j < storesToVisit; j++){
                storesLoc.add(scanner.nextInt());
            }
        }
    }
}
