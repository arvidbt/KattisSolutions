import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class icpcAwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTeams = scanner.nextInt();
        LinkedHashMap<String, String> compTeams = new LinkedHashMap<>();

        for(int i = 0; i < numOfTeams; i++){
            String university = scanner.next();
            String team = " " + scanner.next();

            if(!compTeams.containsKey(university) && compTeams.size() < 12){
                compTeams.put(university, team);
            }
        }
        for(Map.Entry<String, String> leaderboard : compTeams.entrySet()){
            System.out.println(leaderboard.getKey() + leaderboard.getValue());
        }
        scanner.close();
    }
}
