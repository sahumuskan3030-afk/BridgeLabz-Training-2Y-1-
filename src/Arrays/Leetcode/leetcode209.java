package Arrays.Leetcode;

public class leetcode209 {
    static void main() {
        int[] nums={2,3,1,2,4,3};
        int target=7;

        int sum=0;
        int start=0;
        int minLen=Integer.MAX_VALUE;


        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           while(sum>=target){
               minLen=Math.min(minLen,i-start+1);
               sum-=nums[start];
               start++;
           }

        }
            System.out.println(minLen);
        }
}
