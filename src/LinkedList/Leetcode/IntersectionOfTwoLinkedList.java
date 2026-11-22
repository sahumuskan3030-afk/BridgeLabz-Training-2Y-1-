package LinkedList.Leetcode;

import java.util.Stack;

public class IntersectionOfTwoLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node Intersect(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;

        while(temp1!=temp2){
          if(temp1!=null){
              temp1=temp1.next;
          }else{
              temp1=head2;
          }

          if(temp2!=null){
              temp2=temp2.next;
          }else{
              temp2=head1;
          }
        }
        return temp1;
    }
    static void main() {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


        Node a1=new Node(100);
        Node b1=new Node(13);
        Node c1=new Node(4);


        a1.next=b1;
        b1.next=c1;
        c1.next=d;


      Node result=Intersect(a,a1);

      if(result!=null) {
          System.out.println(result.data);
      }else{
          System.out.println("Intersection");
      }
    }
}
