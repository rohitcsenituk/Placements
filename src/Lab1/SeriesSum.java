package Lab1;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float result=0;
        for (float i = 1 ; i <=n ; i++) {
            result+=1/i;
        }
        System.out.print(result);
    }
}
