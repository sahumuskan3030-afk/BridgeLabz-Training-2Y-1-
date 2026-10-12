package Recursion;

public class fact {
    public static int factorial(int n){
        //base case
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    static void main() {

        System.out.println(factorial(2));
    }
}
