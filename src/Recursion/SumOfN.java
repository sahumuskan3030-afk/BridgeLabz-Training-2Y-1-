package Recursion;

public class SumOfN {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    static void main() {
        System.out.println(sum(5));
    }
}
