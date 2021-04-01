import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Akcija {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBooks = scanner.nextInt();
        int freeBooks = numberOfBooks/3;
        int priceToPay = 0;
        System.out.println(freeBooks);
        List<Integer>bookPrices = new ArrayList<>();

        for(int i = 0; i < numberOfBooks; i++){
            bookPrices.add(scanner.nextInt());
        }
        Collections.sort(bookPrices);
        for(int i = freeBooks; i < numberOfBooks; i++){
            priceToPay += bookPrices.get(i);
        }
        System.out.println(priceToPay);
    }
}
