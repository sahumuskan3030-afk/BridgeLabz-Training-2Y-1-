package Arrays.SlidingWindow;

import java.util.Scanner;

public class DistinctNumber {
    static void main() {
        int[] nums = {1, 2, 3, 2, 2, 1, 3};
        int k = 3;
        int[] result = new int[nums.length - k];
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
            int n=count;
            result[0]=count;
        }
        System.out.println(count);
        for(int i=k;i<=nums.length;i++){
            if(nums[i]!=nums[i+1]){
                count++;
            }
            result[i-k]=count;
        }
    }
}
