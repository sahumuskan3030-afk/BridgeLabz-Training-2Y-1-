package Recursion;

public class MaxNumber {
    public static int max(int[] arr,int idx){
        //base case
         if(idx==arr.length){
             return -1;
         }
         int small=max(arr,idx+1);
         return Math.max(small,arr[idx]);
    }

    static void main() {
        int[] arr={2,7,9,3,1};
        System.out.println(max(arr,0));
    }
}
