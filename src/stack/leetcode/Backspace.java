package stack.leetcode;

import java.util.Stack;

public class Backspace {
    public static boolean compare(String s,String t){
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }else{
                st1.push(ch);
            }
        }

        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }else{
                st2.push(ch);
            }
        }

        return st1.equals(st2);
    }

    static void main() {

        String s="ab#c";
        String t="cd#c";
        System.out.println(compare(s,t));
    }
}
