package Recursion;

public class GCD {
    public static int solve(int x,int y){
        //base case
        if(x%y==0){
            return y;
        }

        return solve(y,x%y);

    }

    static void main() {
        int x=16;
        int y=12;
        System.out.println(solve(y,x));
    }
}
