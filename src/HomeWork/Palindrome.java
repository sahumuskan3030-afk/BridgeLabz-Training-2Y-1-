package HomeWork;

public class Palindrome {
    public static String print(String s,int idx){
        //base case
        if(s.length()==idx){
            return "" ;
        }
     String str1=s.charAt(idx)+print(s,idx+1);
        return str1;
    }

    public static String reverse(String s, int idx){
        if(s.length()==idx){
            return "";
        }
       String str2=reverse(s,idx+1)+s.charAt(idx);
        return str2;
    }
    public static boolean check(String str1,String  str2){
       return str1.equals(str2);
    }

    static void main() {
        String s="manvi";
        String str1=print(s,0);
        String str2=reverse(s,0);
        System.out.println(" "+str1);
        System.out.println(" "+str2);
        System.out.println("Is palindrome "+check(str1,str2));
    }
}
