package LinkedList.Assignment;

import java.util.Scanner;

public class LinkedListCycle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static boolean Cycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }

    static void main() {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the size linke list");
        int n=sc.nextInt();

        Node head=null;
        Node tail=null;

        System.out.println("enter the value of linkedlist");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            Node newNode =new Node(value);

            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        System.out.println("enter the position where we attached");
        int pos=sc.nextInt();
        if(pos>=0 && pos<n){
            Node temp=head;

            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            tail.next=temp;
        }

        System.out.println(Cycle(head));

    }
}
