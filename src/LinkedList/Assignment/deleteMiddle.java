package LinkedList.Assignment;

public class deleteMiddle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node delMiddle(Node head){
        if(head.next==null){
            return null;
        }

        Node slow=head;
        Node fast=head;

        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    static void main() {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
       // Node e=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
       // d.next=e;

        System.out.println("original stack");
        display(a);

        System.out.println("after deleteing the middl element");
        a=delMiddle(a);
        display(a);
    }
}
