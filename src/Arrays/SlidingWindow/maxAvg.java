package Arrays.SlidingWindow;

import java.util.Scanner;

public class maxAvg {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] nums=new int[n];

       for(int i=0;i<nums.length;i++){
           nums[i]=sc.nextInt();
       }
        int size=sc.nextInt();

        int sum=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];
        }
       int max=sum;

        for(int i=1;i<=nums.length-size;i++){
            sum=sum-nums[i-1]+nums[i+size-1];
           max=Math.max(max,sum);
        }
        double result=(double)max/size;
        System.out.println(result);
    }
}
