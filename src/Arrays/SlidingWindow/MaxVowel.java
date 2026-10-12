package Arrays.SlidingWindow;

import java.util.Scanner;

public class MaxVowel {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int count=0;
        //first k size window
        for(int i=0;i<k;i++){
          char ch=s.charAt(i);
          if(Vowel(ch)){
              count++;
          }
        }
        int maxCount=count;
        //next window
        for(int i=k;i<s.length();i++){
            if(Vowel(s.charAt(i-k))){
                count--;
            }
            if(Vowel(s.charAt(i))){
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        System.out.println(maxCount);
    }
    public static boolean Vowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}
