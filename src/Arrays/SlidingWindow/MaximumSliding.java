package Arrays.SlidingWindow;

import java.util.Scanner;
import java.util.Arrays;

public record MaximumSliding() {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the size of k");
        int k=sc.nextInt();
        System.out.print("enter the value");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        int[] result=new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            int max=nums[i];
            for(int j=i;j<i+k;j++){
                max=Math.max(nums[j],max);
            }

            result[i]=max;
        }
        System.out.println(Arrays.toString(result));
    }
}
