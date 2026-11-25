package stack.Assignment;

import java.util.Stack;

public class Baseball {
    public static int game(String[] ops){
        Stack<Integer> st=new Stack<>();

        for(String ch:ops){
            if(ch.equals("C")){
                st.pop();
            }else if(ch.equals("D")){
                st.push(st.peek()*2);
            }else if(ch.equals("+")){
                int val1=st.pop();
                int val2=st.peek();
                int newval=val2+val1;
                st.push(val1);
                st.push(newval);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }

        int total=0;
        for(int score:st){
            total+=score;
        }
        return total;
    }
    static void main() {
        String[] ops={"5","2","C","D","+"};
        System.out.println(game(ops));
    }
}
