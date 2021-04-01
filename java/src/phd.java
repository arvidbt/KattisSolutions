import java.util.Scanner;

public class phd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine();
        String skip = "P=NP";

        for(int i = 0; i < cases; i++){
            String input = scanner.nextLine();
            if(input.equals(skip)){
                System.out.println("skipped");
            }
            else{
                String[] parts = input.split("\\+");
                int first = Integer.parseInt(parts[0]);
                int second = Integer.parseInt(parts[1]);
                System.out.println(first+second);
            }
        }
    }
}

