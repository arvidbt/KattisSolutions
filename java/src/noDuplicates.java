import java.util.Scanner;

public class noDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String words[] = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    System.out.println("no");
                    System.exit(0);
                }
            }
        }
        System.out.println("yes");
    }
}
