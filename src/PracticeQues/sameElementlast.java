package PracticeQues;

public class sameElementlast {
    public static void print(String str,int idx,String newString,int count,char element){

        //base case
        if(str.length()==idx){
            while(count>0){
                newString+='x';
                count--;
            }
            System.out.println(newString);
            return ;
        }

        char ch=str.charAt(idx);

        if(ch==element){
            count++;
        }else{
            newString+=ch;
        }
         print(str,idx+1,newString,count,element);
    }

    static void main() {
        String str="abvxsxkjx";
        char element='x';
        print(str,0,"",0,element);
    }
}
