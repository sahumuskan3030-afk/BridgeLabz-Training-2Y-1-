package HomeWork;

public class PrintNewLine {
    public static void print(String s,int idx){
        //base case
        if(idx==s.length()){
            return;
        }
        System.out.println(s.charAt(idx));
        print(s,idx+1);
    }

    static void main() {
        String s="nadajfl";
        print(s,0);
    }
}
