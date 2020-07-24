package array_practise;
/*
Reverse of an array
 */

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("small a Waale array");
        for (int arr1 :
                a) {
            System.out.println(arr1);
        }
        displayReverseArray(a);
    }

    private static void displayReverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println("small a reverse Waale array");
        for (int arr1 :
                a) {
            System.out.println(arr1);
        }
    }
}
