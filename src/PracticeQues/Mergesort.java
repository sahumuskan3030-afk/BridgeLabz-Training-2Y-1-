package PracticeQues;

public class Mergesort {
    public static void merge(int[] arr,int l,int r){
        //base case
        if(l>r){
            return;
        }
        int mid=l+(r-l)/2;
        int[] arr1=new int[mid-l+1];
        int[] arr2=new int[r-mid];

        int i=0;
        int j=0;
        int k=l;
        while(i<arr1.length&& j<arr2.length){
            if(arr[i]<arr[j]){
                arr[k++]=arr[i++];
            }else{
                arr[k++]=arr[j++];
            }
        }

        while(i<arr1.length){
            arr[k++]=arr[i++];
        }
        while(j<arr2.length){
            arr[k++]=arr[j++];
        }
        System.out.println(arr[k]);
    }

    static void main() {
        int[] arr={2,6,11,4,9,13};
        merge(arr,0,arr.length);
    }
}
