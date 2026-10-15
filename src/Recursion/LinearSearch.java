package Recursion;

public class LinearSearch {
    public static int find(int[] arr,int target,int idx){
        //base case
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==target) {
            return idx;
        }
        int ans = find(arr,target,idx+1);
       return ans;

    }

    static void main() {
        int[] arr={7,8,4,3,9};
        System.out.println(find(arr,9,0));
    }
}
