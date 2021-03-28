import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spellingBee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bee = scanner.nextLine();
        int iterations = scanner.nextInt();
        int counter = 0;
        List<String> yupNames = new ArrayList<String>();

        scanner.nextLine();

        for(int i = 0; i < iterations; i++) {
            String word = scanner.nextLine();
            boolean addThis = true;

            if (word.contains(bee.charAt(0)+"") && word.length() >= 4) {

                for (int j = 0; j < word.length(); j++) {
                    if (bee.indexOf(word.charAt(j)) == -1) {
                        addThis = false;
                    }
                }
                if (addThis) {
                    yupNames.add(word);
                    counter++;
                }
            }
        }
        for(int i = 0; i < counter; i++){
            System.out.println(yupNames.get(i));
        }
    }
}
