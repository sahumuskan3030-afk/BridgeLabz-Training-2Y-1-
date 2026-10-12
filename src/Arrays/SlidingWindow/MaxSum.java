package Arrays.SlidingWindow;

public class MaxSum {
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6};
        int size=3;

        int sum=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];
        }

        int maxSum=sum;
        for(int i=1;i<=nums.length-size;i++){
            sum=sum-nums[i-1]+nums[i+size-1];
            maxSum=Math.max(sum,maxSum);
        }

        System.out.println("maximumsum " +maxSum/size);
    }
}
