import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for(int i = 0; i < testCases; i++){
            double total = 0;
            List<Integer> inputs = new ArrayList<>();
            int numGrades = scanner.nextInt();
            for(int j = 0; j < numGrades; j++){
                int in = scanner.nextInt();
                total += in;
                inputs.add(in);
            }

            total = total/numGrades;
            for(int k = 0; k < inputs.size(); k++){
                if(inputs.get(k) > total){

                }
            }


        }
    }
}
