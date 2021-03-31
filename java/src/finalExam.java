import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class finalExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int questions = scanner.nextInt();
        int rightAnswer = 0;
        List<String> answers = new ArrayList<>();
        scanner.nextLine();

        for(int i = 0; i < questions; i++){
            answers.add(scanner.nextLine());
        }
        for(int i = 0; i < questions - 1; i++){
            if(answers.get(i).equals(answers.get(i+1))){
                rightAnswer++;
            }
        }
        System.out.println(rightAnswer);
    }
}
