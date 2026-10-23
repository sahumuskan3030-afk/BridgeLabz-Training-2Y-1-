package Recursion;

public class basic {
    public static void print1(int idx){
        if(idx>10){
            return ;
        }
        System.out.println(idx);
        print(idx+1);

    }

    public static void print(int idx){
        if(idx==0){
            return ;
        }
        print(idx-1);
        System.out.println(idx);
    }
    public static void main(String[] args){

        print(10);
        print1(0);

    }

}
