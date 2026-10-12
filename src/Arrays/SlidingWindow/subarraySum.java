package Arrays.SlidingWindow;

import java.util.Scanner;

public class subarraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
            if(k==sum) {
                count++;
            }
            }
        }
        System.out.println(count);
    }
}
