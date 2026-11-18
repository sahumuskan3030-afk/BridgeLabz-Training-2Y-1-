package stack.BasicPromblem;

import java.util.Stack;

public class Basicstack {
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
       for(int i=0;i<5;i++){
           st.push(i);
       }
        System.out.println(st);
       st.pop();
        System.out.println(st);

        System.out.println(st.peek());

    }
}
