package Recursion;

public class Finbonacci {
    public static int fibo(int n){
        //base case
        if (n==1||n==0) return n;
        int first=fibo(n-1);
        int sec=fibo(n-2);
        return first+sec;

    }

    static void main() {
        int n=5;
       System.out.println(fibo(n));
       //fibo(n);
    }
}
