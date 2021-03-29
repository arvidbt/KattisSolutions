
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class detailedDifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        List<String> print = new ArrayList<String>();
        List<String> print1 = new ArrayList<String>();
        List<String> print2 = new ArrayList<String>();

        for(int i = 0; i < testCases; i++){

            String line1 = scanner.next();
            String line2 = scanner.next();
            String output = "";

            for(int j = 0; j < line1.length(); j++){
                if(line1.charAt(j) == line2.charAt(j)){
                    output += ".";
                }
                else{
                    output += "*";
                }
            }
            print.add(line1);
            print1.add(line2);
            print2.add(output);
        }
        for(int i = 0; i < testCases; i++){
            System.out.println(print.get(i));
            System.out.println(print1.get(i));
            System.out.println(print2.get(i));
        }
    }
}
