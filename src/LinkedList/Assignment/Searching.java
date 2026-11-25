package LinkedList.Assignment;

public class Searching {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void insert(int data){
        Node temp=new Node(data);

        if(temp==null){
            head=temp;
            tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
    }
    public static int search(int value){
        Node temp = head;
        int idx=0;

        while(temp!=null){
            if(temp.data==value){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    static void main() {
        insert(10);
        insert(20);
        insert(30);
        insert(30);
        System.out.println(search(30));
        display();
    }
}
