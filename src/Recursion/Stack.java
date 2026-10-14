package Recursion;

public class Stack {
    public static void print(int[] arr,int idx){
        int n=arr.length;
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]+" ");
        print(arr,idx+1);
    }
    public static void Rev(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        Rev(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }

    static void main() {
        int[] arr={1,6,4,98,34,23,45};
       print(arr,0);
       Rev(arr,0);
    }
}
