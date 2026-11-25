package LinkedList.Assignment;

public class nthNodeEndLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static int nthNode(Node head,int n){
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }
    static void main() {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node (4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(nthNode(a,2));

//       Node res=nthNode(a,2);
//        System.out.println(res.data);

    }
}
