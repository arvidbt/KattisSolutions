import java.util.Scanner;

public class faktor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int publishedArticles = scanner.nextInt();
        int ImpactFactor = scanner.nextInt();

        int he = (publishedArticles * ImpactFactor) - publishedArticles + 1;

        System.out.println(he);
        scanner.close();
    }
}
