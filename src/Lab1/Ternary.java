package Lab1;

// Java code to illustrate ternary operator

import java.util.Scanner;

class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // variable declaration
        int n1 = scan.nextInt(),
                n2 = scan.nextInt(),
                res;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Performing ternary operation
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        // Print the largest number
        System.out.println("Result = " + res);
    }
}
