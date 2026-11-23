package stack.BasicPromblem;

import java.util.Stack;

public class pushMethod {
    public static class Stack {
        int top;
        int arr[];

        public Stack(int size) {
            arr=new int[size];
            this.top = -1;
        }

        void push(int x) {
            if (top == arr.length - 1) {
                System.out.println("stack overflow" + " ");
                return;
            }

            top++;
            arr[top] = x;
        }


    public void display() {
        if (top == -1) {
            System.out.println("stack empty");
            return;
        }
        System.out.println("Values in Stack are");
        for (int i = top; i >=0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
    static void main() {
        Stack st=new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(90);
        st.display();
    }

}
