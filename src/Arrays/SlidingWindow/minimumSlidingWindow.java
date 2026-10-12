package Arrays.SlidingWindow;

import java.util.Scanner;

public class minimumSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();
        String t=sc.nextLine();
        int[] freq=new int[128];

        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }



        int left=0;
        int count=t.length();
        int minLen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;



            while(count==0) {
                int len = right - left + 1;
                if (len < minLen) {
                    minLen = len;
                    start = left;
                }


                char leftchar = s.charAt(left);
                freq[leftchar]++;
                if (freq[leftchar] > 0) {
                    count++;
                }
                left++;
            }
            }
            if(minLen==Integer.MAX_VALUE){
                System.out.println(" ");
            }else{
                System.out.println(s.substring(start,start+minLen));
            }
        }
    }

