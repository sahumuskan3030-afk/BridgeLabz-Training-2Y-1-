package Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Frequency {
    static void main() {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<nums.length;i++){
           nums[i]=sc.nextInt();
       }

        //hashset automatically duplicate remove karte h contains k use duplicate value k sath operation k liye hota h
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                set.add(num);
            }
        }

        System.out.println(set);
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            if(!set.contains(i+1)){
//                list.add(i+1);
//            }
//        }
//        System.out.println(list);

    }
}
