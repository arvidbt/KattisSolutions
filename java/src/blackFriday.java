import java.util.*;

public class blackFriday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = scanner.nextInt();

        HashMap<Integer, Integer> uniques = new HashMap<Integer, Integer>();
        HashSet<Integer> notUnique = new HashSet<>();

        for(int i = 0; i < groupSize; i++){
            int roll = scanner.nextInt();
            if(!notUnique.contains(roll)){
                uniques.put(roll, i);
            }
            else{
                uniques.remove(roll);
            }
            notUnique.add(roll);
        }
        int max = 0;
        int index = 0;
        for(int value : uniques.keySet()){
            if(max < value){
                max = value;
                index = uniques.get(value);
            }
        }
        if(max == 0){
            System.out.println("none");
            System.exit(0);
        }
        System.out.println(index + 1);
    }
}

