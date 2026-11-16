package LinkedList.PracticeQues;

public class InsertAtBegin {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head;
    static Node tail;


    public static void insert(int value){
        Node temp=new Node(value);

        if(head==null){
            head=temp;
            tail=temp;
        }else {
            temp.next = head;
            head=temp;
        }
    }
    public static void inserat(int data){
        Node temp=new Node(data);

        if(head==null){
            head=temp;
            temp=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }

    public static void mid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
    }

    public static void LinkedlistCycle(){
        Node slow=head;
        Node fast=head;
        while(slow==fast){
            slow=slow.next;
            fast=fast.next.next;
        }
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }

    static void main() {
       insert(30);
       insert(20);
       insert(10);
       mid();
        display();
    }
}
