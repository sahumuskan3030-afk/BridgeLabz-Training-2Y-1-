package Arrays.HashPromblem;

import java.util.HashMap;
import java.util.Scanner;

public class CountNonReapting {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
