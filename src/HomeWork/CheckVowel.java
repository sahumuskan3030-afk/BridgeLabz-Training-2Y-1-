package HomeWork;

public class CheckVowel {
    public static int count(String str,int idx){
        //base case
        int count=0;
        if(idx==str.length()){
            return 0;
        }
        char ch=str.charAt(idx);

       if(vowel(ch)){
           count++;
       }
      count= count+count(str,idx+1);
       return count;

    }

    public static boolean vowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }

    static void main() {
        String str="aabcsdsere";
        System.out.println(count(str,0));
    }
}
