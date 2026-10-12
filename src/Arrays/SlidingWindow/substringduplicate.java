package Arrays.SlidingWindow;

public class substringduplicate {
    public static void main(String[] args){
        String s="abcabcbb";
        int j=0;
        int maxLen=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            (freq[s.charAt(i)-'a'])++;
            while(freq[s.charAt(i)-'a']>2){
                freq[s.charAt(j)-'a']--;
                j++;
            }
             maxLen=Math.max(maxLen,i-j+1);
        }
        System.out.println(maxLen);
    }
}
