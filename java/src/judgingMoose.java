import java.util.Scanner;

public class judgingMoose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int leftTine = scanner.nextInt();
        int rightTine = scanner.nextInt();

        if(leftTine == 0 && rightTine == 0){
            System.out.println("Not a moose");
        }

        else if(leftTine == rightTine && leftTine > 0){
            System.out.println("Even " + (leftTine+rightTine));
        }
        else{
            int maxAntler = Math.max(leftTine, rightTine);
            System.out.println("Odd " + (maxAntler * 2));
        }
    }
}
