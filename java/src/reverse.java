import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = scanner.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 1; i <= inputs; i++){
            numbers.add(scanner.nextInt());
        }
        Collections.reverse(numbers);
        for(int i = 0; i < inputs; i++){
            System.out.println(numbers.get(i));
        }
    }
}
