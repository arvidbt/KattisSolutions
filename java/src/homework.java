import java.util.Scanner;
import java.lang.Character;
public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jojo = scanner.nextLine();
        int count = 0;

        for(int i = 0; i < jojo.length() - 2; i++){

            if(jojo.charAt(i+1) == '-'){
                int temp1 = jojo.charAt(i+2);
                int temp2 = jojo.charAt(i);

                count += Math.abs(temp1 - temp2) + 1;
            }
            if(jojo.charAt(i+1) == ';') {
                count++;

            }
        }
        System.out.println(count + 1);
    }
}
