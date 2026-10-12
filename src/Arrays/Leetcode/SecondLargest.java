package Arrays.Leetcode;

import java.util.Scanner;

public class SecondLargest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (smax != max && arr[i] > smax) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
