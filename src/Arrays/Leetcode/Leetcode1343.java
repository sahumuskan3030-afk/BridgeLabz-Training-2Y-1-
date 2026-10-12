package Arrays.Leetcode;

public class Leetcode1343 {
    public static void main(String[] args){
        int nums[]={2,2,2,2,5,5,5,8};
        int k=3;
        int count=0;
        int threshold=4;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(sum/k>=threshold) count++;
        for(int i=1;i<=nums.length-k;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            if(sum/k>=threshold){
                count++;
            }
        }
        System.out.println(count);
    }
}
