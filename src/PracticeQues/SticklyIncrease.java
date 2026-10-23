package PracticeQues;

public class SticklyIncrease {
    public static boolean incOrder(int[] arr,int idx){
      //base case
      if(arr.length-1==idx){
          return true;
      }
      if(arr[idx]<arr[idx+1]){
         return incOrder(arr,idx+1);
      }else{
          return false;
      }
    }

    static void main() {
        int[] arr={1,5,5,9};
        System.out.println(incOrder(arr,0));
    }
}
