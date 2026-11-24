package LinkedList.Leetcode;

import java.util.Scanner;

public class LinkedListCycleII {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node detectCycle(Node head){
        if(head==null || head.next==null) return null;

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }

        if(fast==null ||fast.next==null) return null;

        Node temp=head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of linked list");
        int n=sc.nextInt();

        Node head=null;
        Node tail=null;

        System.out.println("enter the value of linked list");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            Node newNode=new Node(value);

            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        System.out.println("postion of linkedlist where attached");

        int pos=sc.nextInt();

        if(pos>=0&&pos<n){
            Node temp=head;

            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            tail.next=temp;
        }

        //detect the cycle
        Node result=detectCycle(head);

        if(result==null){
            System.out.println("No cycle");
        }else{
            System.out.println(result.data);
        }
    }
}
