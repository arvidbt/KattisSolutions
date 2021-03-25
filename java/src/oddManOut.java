import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class oddManOut {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int iterations = scanner.nextInt();

        for(int i = 0; i < iterations; i++){
            int guests = scanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<Integer> codes = new ArrayList<>();
            long alone = 0;

            for(int j = 0; j < guests; j++){
                numbers.add(scanner.nextInt());
            }

            for(int j = 0; j < guests; j++){
                if(!codes.contains(numbers.get(j))){
                    codes.add(numbers.get(j));
                    alone +=  numbers.get(j);
                }

                else{
                    alone -= numbers.get(j);
                }
            }

            System.out.println("Case #"+(i+1)+": "+alone);

        }
        scanner.close();
    }
}
