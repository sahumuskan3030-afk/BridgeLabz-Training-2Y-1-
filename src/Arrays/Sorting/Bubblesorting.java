package Arrays.Sorting;

public class Bubblesorting {
    static void main() {
        int[] nums={2,98,54,78,3,67};
        //Apply bubble sort
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++) {
            System.out.print(" "+nums[i]);
        }
    }
}
