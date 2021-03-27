import java.util.Scanner;
import java.lang.String;

public class CryptoConundrum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        String cipher = scanner.nextLine();

        for(int i = 0; i < cipher.length(); i++){
            char c = cipher.charAt(i);
            char cc = cipher.charAt(i+1);
            char ccc = cipher.charAt(i+2);

            if(c != 'P'){
                counter++;
            }
            if(cc != 'E'){
                counter++;
            }
            if(ccc != 'R'){
                counter++;
            }
            i += 2;
        }
        System.out.println(counter);
    }
}
