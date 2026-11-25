package LinkedList.Assignment;


public class BasicList {
    int data;
    BasicList next;

    public BasicList(int data){

        this.data=data;
    }

    static void main() {
        BasicList a=new BasicList(3);
        BasicList b=new BasicList(4);
        BasicList c=new BasicList(5);
        BasicList d=new BasicList(6);
        BasicList e=new BasicList(7);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;


        //method 2
        System.out.println("trick 2");
        System.out.print(a.data+"->");
        System.out.print(a.next.data+"->");
        System.out.print(a.next.next.data+"->");
        System.out.print(a.next.next.next.data+"->");
        System.out.print(a.next.next.next.next.data+"->");
        System.out.print(a.next.next.next.next.next);
        System.out.println();
        System.out.println("Trick2 by usng for loop");
        BasicList temp=a;
        for(int i=0;i<5;i++){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

        //while loop
        System.out.println();
        System.out.println("Trick 3 by using while loop");
        BasicList temp2=a;
        while(temp2!=null){
            System.out.print(temp2.data+"->");
            temp2=temp2.next;
        }

        display(a);
    }
    public static void display(BasicList head){
        System.out.println();
        System.out.println("trick 4");
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }

}
