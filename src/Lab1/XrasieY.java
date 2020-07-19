package Lab1;

import java.util.Scanner;

public class XrasieY {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt(),y=scanner.nextInt(),pow=1;
        for (int i = 0; i <y ; i++) {
            pow*=x;
        }
        System.out.print(pow);

    }
}
