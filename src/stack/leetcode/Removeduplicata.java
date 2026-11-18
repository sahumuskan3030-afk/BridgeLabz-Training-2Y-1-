package stack.leetcode;

import java.util.Stack;

public class Removeduplicata {
    public static String remove(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&& st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    static void main() {
        String s="abdcba";
        System.out.println(remove(s));
    }
}
