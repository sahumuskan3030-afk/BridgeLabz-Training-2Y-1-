package HomeWork;

public class RemoveDuplicate {
//    public static void remove(String s,int idx,String newstr){
//       // base case
//        if(s.length()==idx){
//            System.out.println(newstr);
//            return;
//        }
//        char ch=s.charAt(idx);
//        if(newstr.indexOf(ch)==-1){
//            newstr+=ch;
//        }
//        remove(s,idx+1,newstr);
//
//    }
//    static void main() {
//        String s="abncdnjaam";
//        remove(s,0,"");
//    }






    public static void removeDupli(String str,int idx,boolean[] map,String newstr){
        //base case
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        char ch=str.charAt(idx);
        if(map[ch-'a']==false){
            newstr+=ch;
            map[ch-'a']=true;
        }
        removeDupli(str,idx+1,map,newstr);
    }

    static void main() {
        boolean[] map=new boolean[26];
        String str="abbcccdef";
        removeDupli(str,0,map,"");
    }
}
