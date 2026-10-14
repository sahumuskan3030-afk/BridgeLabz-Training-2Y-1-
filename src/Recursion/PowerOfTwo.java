package Recursion;

public class PowerOfTwo {
    public static boolean power(int n){
        //base case
        if(n==1) return true;
        if(n%2!=0||n<=0) return false;
        return power(n/2);
    }

    static void main() {
        int n=3;
        System.out.println(power(n));
    }
}
