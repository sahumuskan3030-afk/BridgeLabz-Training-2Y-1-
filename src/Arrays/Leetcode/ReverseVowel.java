package Arrays.Leetcode;

import java.util.Scanner;

public class ReverseVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!isVowel(arr[i])){
                i++;
            }
            else if(!isVowel(arr[j])){
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
       System.out.println(new String(arr));
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
