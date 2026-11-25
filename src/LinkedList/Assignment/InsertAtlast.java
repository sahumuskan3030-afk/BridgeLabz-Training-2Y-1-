package LinkedList.Assignment;

public class InsertAtlast {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data=data;
        }
    }

    public static Node head;
    public static Node tail;

    public static void lastInsert(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }

    public static void display(){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    static void main() {
        lastInsert(10);
        lastInsert(20);
        lastInsert(30);
        lastInsert(40);
        display();
    }
}
