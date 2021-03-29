import java.util.Scanner;

public class sevenWonders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cards = scanner.nextLine();

        int tabletCards = 0;
        int compassCards = 0;
        int gearCards = 0;
        int combine = 0;
        int points = 0;

        for(int i = 0; i < cards.length(); i++){

            if(cards.charAt(i) == 'T'){
                tabletCards++;
            }
            if(cards.charAt(i) == 'C'){
                compassCards++;
            }
            if(cards.charAt(i) == 'G'){
                gearCards++;
            }
        }
        points = (int)Math.pow(tabletCards, 2) + (int)Math.pow(compassCards, 2) + (int)Math.pow(gearCards, 2);

        while(gearCards > 0 && compassCards > 0 && tabletCards > 0)
        {
            combine += 7;
            gearCards--;
            compassCards--;
            tabletCards--;
        }

        System.out.println(points + combine);
    }
}
