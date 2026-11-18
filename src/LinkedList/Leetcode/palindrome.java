package LinkedList.Leetcode;

public class palindrome {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static boolean palin(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node prev=null;
        Node curr=slow;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=head;
        Node left=prev;

        while(left!=null){
            if(right.val!=left.val){
                return false;
            }

            left=left.next;
            right=right.next;
        }
        return true;

    }
    static void main(String[] args) {
       Node a=new Node(1);
       Node b=new Node(2);
       Node c=new Node(3);
       Node d=new Node(2);
       Node e=new Node(2);

       a.next=b;
       b.next=c;
       c.next=d;
        d.next=e;

       if(palin(a)){
           System.out.println("palindrome");
       }else{
           System.out.println("Not palindrome");
       }
    }
}
