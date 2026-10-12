package Arrays.Leetcode;

import java.util.Scanner;

public class MergeAlter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        StringBuilder str=new StringBuilder();
        //by two pointer approach
        int i=0;
        int j=0;
        while(i<s1.length()||j<s2.length()){
            if(i<s1.length()&&j<s2.length()){
                str=str.append(s1.charAt(i)).append(s2.charAt(j));
                i++;
                j++;
            }
            else if(i<s1.length()){
                str=str.append(s1.charAt(i));
                i++;
            }
            else{
                str=str.append(s2.charAt(j));
                j++;
            }
        }
        System.out.println(str.toString());
    }
}
