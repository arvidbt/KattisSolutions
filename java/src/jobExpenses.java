import java.util.Scanner;

public class jobExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int output = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            int expenseAndIncome = scanner.nextInt();
            if(expenseAndIncome < 0){
                sum += expenseAndIncome;
            }
            else{
                sum += 0;
            }


        }
        System.out.println(Math.abs(sum));
    }
}
