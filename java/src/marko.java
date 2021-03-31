import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class marko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int words = scanner.nextInt();
        int numOfWords = 0;
        String clicks;
        List<String> input = new ArrayList<String>();

        char[] two   = {'a', 'b', 'c'};
        char[] three = {'d', 'e', 'f'};
        char[] four  = {'g', 'h', 'i'};
        char[] five  = {'j', 'k', 'l'};
        char[] six   = {'m', 'n', 'o'};
        char[] seven = {'p', 'q', 'r', 's'};
        char[] eight = {'m', 'n', 'o'};
        char[] nine  = {'w', 'x', 'y', 'z'};

        for(int i = 0; i < words; i++){
            String wordEntered = scanner.next();
            input.add(wordEntered);

            if(i == words - 1){
                clicks = scanner.next();
            }
        }
        for(int i = 0; i < words; i++){

        }
        System.out.println(numOfWords);
    }
}
