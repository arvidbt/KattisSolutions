import java.util.Scanner;

public class licenseToLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int validLicense = scanner.nextInt();
        int minJunk = Integer.MAX_VALUE;
        int dayToLaunch = 0;

        for(int i = 0; i < validLicense; i++){
            int spaceJunk = scanner.nextInt();
            if(spaceJunk < minJunk){
                dayToLaunch = i;
                minJunk = spaceJunk;
            }
        }
        System.out.println(dayToLaunch);
    }
}
