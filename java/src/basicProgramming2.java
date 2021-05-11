import java.util.*;

public class basicProgramming2 {
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
                int l = 0;
                int r = N - 1;
                Arrays.sort(arr);

                while(l < r){
                    if(arr[l] + arr[r] == 7777 && arr[l] != arr[r]){
                        System.out.println("Yes");
                        System.exit(0);
                    }
                    else if(arr[l] + arr[r] < 7777){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
                System.out.println("No");
                break;

            case 2:

                Set<Long> unique = new HashSet<Long>();

                for(int i = 0; i < N; i++){
                    unique.add(arr[i]);
                }
                if(unique.size() < N){
                    System.out.println("Contains duplicates");
                }
                else{
                    System.out.println("Unique");
                }
                break;

            case 3:

                int x = N/2;
                HashMap<Long, Integer> count = new HashMap<>();

                for(int i = 0; i < N; i++){
                    int a = 0;
                    if(count.get(arr[i]) != null){
                        a = count.get(arr[i]);
                    }
                    count.put(arr[i], a+1);
                    if(a+1 > x){
                        System.out.println(arr[i]);
                        System.exit(0);
                    }
                }
                System.out.println("-1");
                break;

            case 4:
                Arrays.sort(arr);
                if(N % 2 == 0){
                    System.out.println(arr[N/2 -1] + " " + arr[N/2]);
                }
                else{
                    System.out.println(arr[N/2]);
                }
                break;
                
            case 5:

                Arrays.sort(arr);

                for(int i = 0; i < N; i++){
                    if(arr[i] >= 100 && arr[i] <= 999){
                        System.out.print(arr[i] + " ");
                    }
                }
                break;
        }
    }
}
