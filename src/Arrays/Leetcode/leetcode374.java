package Arrays.Leetcode;

import java.util.Scanner;

public class leetcode374 {
    public class Main {
        static int pick = 10;

        //guess API
        static int guess(int num) {
            if (num > pick) {
                return -1;
            } else if (num < pick) {
                return 1;
            } else {
                return 0;
            }
        }

        //Binary Search
        static int guessNumber(int n) {

            int i = 1;
            int j = n;
            while (i <= j) {
                int mid = i + (j - i) / 2;
                int result = guess(mid);
                if (result == 0) {
                    System.out.println(result);
                } else if (result == -1) {
                    mid = j - 1;
                } else {
                    mid = i + 1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = guessNumber(n);
            System.out.println(ans);
        }
    }
}
