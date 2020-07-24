package array_practise;

import java.util.Scanner;

/**
 * declaration of arrays
 */
public class ArrayDemo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for (int arr :
                a) {
            if (arr < 0) System.out.println(arr);
                // else if (arr == 0) System.out.println(arr);
            else if (arr % 2 == 0) System.out.println(arr);
        }
    }

}
