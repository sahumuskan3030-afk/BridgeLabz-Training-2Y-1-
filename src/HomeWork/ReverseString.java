package HomeWork;

public class ReverseString {
    public static void print(String s,int idx){
        //base case
        if(idx==s.length()){
            return;
        }
        print(s,idx+1);
        System.out.print(s.charAt(idx));
    }

    static void main() {
        String s="abcd";
        print(s,0);
    }
}
