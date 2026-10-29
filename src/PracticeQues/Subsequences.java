package PracticeQues;

public class Subsequences {
    public static void orderSequence(String str,int idx,String newstr){
        //base case
        if(idx==str.length()){
            System.out.print("|"+newstr+"|");
            return;
        }

        //to be subsequence
        orderSequence(str,idx+1,newstr+str.charAt(idx));

        //not be subsequence
        orderSequence(str,idx+1,newstr);
    }

    static void main() {
        String str="abc";
        orderSequence(str,0,"");
    }
}
