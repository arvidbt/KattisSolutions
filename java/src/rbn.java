import java.util.Scanner;
import java.lang.Math;
import java.lang.*;
import java.io.*;
import java.util.*;

public class rbn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String x = Integer.toBinaryString(number);

        byte[] newBytes = x.getBytes();
        byte[] res = new byte[newBytes.length];

        for (int i = 0; i < newBytes.length; i++){
            res[i] = newBytes[newBytes.length - i - 1];
        }

        String y = new String(res);
        int converted = Integer.parseInt(y, 2);

        System.out.println(converted);

        scanner.close();
    }
}
