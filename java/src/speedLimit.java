import java.util.Scanner;

public class speedLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = 0;
        int dataSet;

        while(loop >= 0){
            dataSet = scanner.nextInt();
            if(dataSet == -1){
                loop = -1;
            }
            int speed;
            int prevHours = 0;
            int hours = 0;
            int totalHours = 0;
            int miles = 0;

            for(int i = 0; i < dataSet; i++){
                speed = scanner.nextInt();
                hours = scanner.nextInt();
                totalHours = hours - prevHours;
                prevHours = hours;
                miles += speed * totalHours;
            }
            if(miles > 0) {
                System.out.println(miles + " miles");
            }
        }
    }
}
