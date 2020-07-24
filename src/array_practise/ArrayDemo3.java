package array_practise;

import java.util.Scanner;

/**
 * find negative, positive, zero, odd, even.
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

            if (a[i] > 0) {
                pos++;
            } else if (a[i] < 0) {
                neg++;
            } else {
                zero++;
            }
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Positive : " + pos + "\nNegative : " + neg + "\nZero : " + zero + "\nodd : " + odd + "\neven : " + even);
    }
}
