import java.util.*;

public class stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pressed = scanner.nextInt();
        boolean stopWatchRunning = false;
        int previousTime = 0;
        int output = 0;

        for(int i = 0; i < pressed; i++){
            int currentTime = scanner.nextInt();

            if(i % 2 == 0){
                stopWatchRunning = true;
                output += currentTime - previousTime;
            }
            else{
                stopWatchRunning = false;
            }
            previousTime = currentTime;
        }
        if(stopWatchRunning){
            System.out.println("still running");
        }
        else{
            System.out.println(previousTime - output);
        }
    }
}
