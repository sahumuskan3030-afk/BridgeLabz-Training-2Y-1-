package LinkedList.Basic;

public class
InsertElement {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void InserAtlast(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public static void InsertAtFirst(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public static int count(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;

            temp=temp.next;
        }

        return count;
    }

    public static void insertAt(int idx,int data){
        Node t=new Node(data);
        Node temp=head;

        if(idx==count()){
            InserAtlast(data);
            return;
        }

        if(idx==0){
            InsertAtFirst(data);
            return;
        }

        if(idx<0||idx>count()){
            System.out.println("wrong input");
            return;
        }

        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
    }

    public  static int GetElement(int idx){
        Node temp=head;

        if(idx<0||idx>count()){
            System.out.println("wrong index");
            return -1;
        }

        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    public static void deleteIndex(int idx){
        Node temp=head;

        if(idx==0) head=head.next;

        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;
        tail=temp;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InserAtlast(10);
        InserAtlast(20);
        InserAtlast(30);
        InsertAtFirst(5);
        System.out.println("length of list:"+count());
        display();
        insertAt(3,5);
        display();

        System.out.println("get the element:"+GetElement(3));

        deleteIndex(2);
        display();
    }
}