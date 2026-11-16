package LinkedList.PracticeQues;

public class Doubly {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int  data){
            this.data=data;
        }
    }

    public static void reverse(){

    }

    public static Node head;
    public static Node tail;

    public static void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    static void main() {
        Node a=new Node(30);
        Node b=new Node(40);
        Node c=new Node(50);
        Node d=new Node(60);
        Node e=new Node(70);
         head=a;

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        display();
    }
}
