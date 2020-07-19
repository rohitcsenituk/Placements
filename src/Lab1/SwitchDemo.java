package Lab1;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
                System.out.print("Bad Review");
                break;
            case 3:
                System.out.print("Average Review");
                break;
            case 4:
            case 5:
                System.out.print("Good Review");
                break;
            default:
                System.out.print("Invalid");
                break;
        }
    }
}
