package Arrays.SlidingWindow;

import java.util.ArrayList;

public class FrequenciesLimitArray {
    public static void main(String[] args){
        int[] arr={2,3,2,3,5};
        int freq[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            list.add(freq[i]);
        }
        System.out.println(list);
    }
}
