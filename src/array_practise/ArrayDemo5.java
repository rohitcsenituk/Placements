package array_practise;

import java.util.Scanner;
/*
sum and product of element in array
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        int sum = 0;
        int prod = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int value : a) {
            sum += value;
            prod *= value;
        }
        System.out.println("sum is :" + sum);
        System.out.println("product is :" + prod);
    }
}
