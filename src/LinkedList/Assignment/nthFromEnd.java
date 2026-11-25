package LinkedList.Assignment;

public class nthFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }

    public static Node nthNode(Node head,int n){
      Node temp=head;
      int size =0;
      while(temp!=null){
          size++;
          temp=temp.next;
      }
      int m=size-n+1;
//return nth node from last
      temp=head;
      for(int i=1;i<=m-1;i++){
          temp=temp.next;
      }
      return temp;
    }

    static void main() {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(0);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node res=nthNode(a,1);
        System.out.println(res.data);
    }
}
