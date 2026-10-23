package HomeWork;

public class countOccurrence {
    public static int count(String s,int idx,char ch){

        //base case
        if(idx==s.length()){
            return 0;
        }
        int count=0;
        if(s.charAt(idx)==ch){
            count++;
        }
        count=count+count(s,idx+1,ch);
        return count;
    }

    static void main() {
        String s="afabbsjdb";
        char ch='b';
        System.out.println(count(s,0,ch));
    }
}
