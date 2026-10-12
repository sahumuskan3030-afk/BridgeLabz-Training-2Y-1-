package Arrays.Leetcode;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[26];

        //cacl frequncy

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
          int ans=-1;
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
              ans=i;
              break;
            }
        }
         System.out.println(ans);
    }
}
