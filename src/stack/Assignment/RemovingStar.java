package stack.Assignment;

import java.util.Stack;

public class RemovingStar {
    public static String remove(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    static void main() {
        String s="leet**cod*e";
        System.out.println(remove(s));
    }
}
