import java.util.Scanner;

public class pokerHand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int max = 0;
        String cards = scanner.nextLine();
        cards = cards.replaceAll("\\s","");

        for(int i = 0; i < cards.length(); i++) {
            char c = cards.charAt(i);
            if(c != 'C' && c != 'D' && c != 'H' && c != 'S') {
                for (int j = 0; j < cards.length(); j++) {
                    if (c == cards.charAt(j)) {
                        count++;
                    }
                }
            }
            if(count > max){
                max = count;
            }
            count = 0;
        }
        System.out.println(max);
    }
}
