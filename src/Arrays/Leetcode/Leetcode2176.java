package Arrays.Leetcode;

public class Leetcode2176 {
    public static void main(String[] args){
        int nums[]={3,1,2,2,2,1,3};
        int k=2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    int res=i*j;
                    if(res%k==0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
