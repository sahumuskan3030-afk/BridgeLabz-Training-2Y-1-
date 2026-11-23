package LinkedList.Leetcode;

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
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        e.next=b;
        System.out.println(Cycle(a));
    }
}
