
import java.util.*;

public class basicProgramming1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int t = scanner.nextInt();
        long[] arr = new long[N];
        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextLong();
        }

        switch (t){
            case 1:
                System.out.println("7");
                break;

            case 2:
                if(arr[0] > arr[1]){
                    System.out.println("Bigger");
                }
                else if(arr[0] == arr[1]){
                    System.out.println("Equal");
                }
                else{
                    System.out.println("Smaller");
                }
                break;

            case 3:
                long a = arr[0];
                long b = arr[1];
                long c = arr[2];
                System.out.println(Math.max(Math.min(a,b), Math.min(Math.max(a,b),c)));
                break;

            case 4:
                long sum = 0;
                for(int i = 0; i < N; i++){
                    sum += arr[i];
                }
                System.out.println(sum);
                break;

            case 5:
                long sum1 = 0;
                for(int i = 0; i < N; i++){
                    if(arr[i] % 2 == 0){
                        sum1+= arr[i];
                    }
                }
                System.out.println(sum1);
                break;

            case 6:
                String alphabet = "abcdefghijklmnopqrstuvwxyz";

                char[] print = new char[N];


                for(int i = 0; i < N; i++){
                    int character = (int)arr[i] % 26;
                    print[i] = alphabet.charAt(character);
                }
                System.out.println(print);
                break;

            case 7:
                int index = 0;
                Set<Integer> visited = new HashSet<Integer>();

                while(true){
                    index = (int)arr[index];
                    if(index >= N){
                        System.out.println("Out");
                        break;
                    }

                    else if(index == N-1){
                        System.out.println("Done");
                        break;
                    }

                    if(visited.contains(index)){
                        System.out.println("Cyclic");
                        break;
                    }
                    visited.add(index);
                }
                break;
        }
    }
}
