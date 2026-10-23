package HomeWork;

public class removeOccurance {
    public static String remove(String s,int idx,char ch){
        //base case
        if(idx==s.length()){
            return "";
        }

        String res=remove(s,idx+1,ch);
        char curr=s.charAt(idx);
        if(s.charAt(idx)==ch){
          return res;
        }else{
           return res+curr;
        }
    }

    static void main() {
        String s="muskana";
        char ch='a';
        System.out.println(remove(s,0,ch));
    }
}
