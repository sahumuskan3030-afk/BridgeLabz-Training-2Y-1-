package Arrays.Sorting;

public class leetcode34 {
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int first=-1;
        int last=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                first=mid;
                j=mid-1;
            }
            else if(nums[mid]<target){
               i=mid+1;
            }else{
               j=mid-1;
            }
        }

        i=0;
        j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                last=mid;
                i=mid+1;
            }else if(nums[mid]<target){
              i=mid+1;
            }else{
                j=mid-1;
            }
        }
        System.out.println(first+" "+last);
    }
}
