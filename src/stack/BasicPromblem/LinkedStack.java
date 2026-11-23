package stack.BasicPromblem;

import java.util.Stack;

public class LinkedStack {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node top=null;
    public static void push(){
        Node temp=new Node(10);
        temp.next=top;
        top=temp;
    }
    public static void peek(){
        if(top==null){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("top element"+top.data);
    }
    public static void pop(){
        if(top==null){
            System.out.println("stack empty");
            return;
        }
        top=top.next;
    }

    public static void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    static void main() {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        display();
    }
}
