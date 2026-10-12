package Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindAnagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();

//        ArrayList<Integer> list=new ArrayList<>();
//        int[] sCount=new int[26];
//        int[] pCount=new int[26];
//        for(char ch:p.toCharArray()){
//            pCount[ch]++;
//        }
//
//        for(int i=0;i<s.length();i++){
//            sCount[s.charAt(i)-'a']++;
//            if(i>=p.length()){
//                sCount[s.charAt(i-p.length())-'a']--;
//            }
//            Arrays.equals(pCount,sCount);
//            list.add(i-p.length()+1);
//        }
//        System.out.println(list);







        ArrayList<Integer> list=new ArrayList<>();
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for(int i=0;i<p.length();i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pCount, sCount)) {
           list.add(0);
        }
        for(int i=1;i<=s.length()-p.length();i++){
            int prev=s.charAt(i-1)-'a';
            int next=s.charAt(i+p.length()-1)-'a';
            sCount[prev]--;
            sCount[next]++;
            if(Arrays.equals(pCount,sCount)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
