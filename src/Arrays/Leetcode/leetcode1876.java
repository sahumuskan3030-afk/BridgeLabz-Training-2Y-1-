package Arrays.Leetcode;

import java.util.Scanner;

public class leetcode1876 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();

        int k=3;
        int count=0;
       for(int i=0;i<=s.length()-k;i++){
          String str=s.substring(i,i+k);
           if(str.charAt(0)!=str.charAt(1)&&str.charAt(1)!=str.charAt(2)&&str.charAt(0)!=str.charAt(2)){
               count++;
           }
       }

        System.out.println(count);
    }
}
