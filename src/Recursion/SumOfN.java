package Recursion;

public class SumOfN {
    public static int sum(int n){

        if(n==1){
            return 1;
        }

        return n+sum(n-1);
    }

    static void main() {
     //int n;
        System.out.println(sum(5));
    }
}
