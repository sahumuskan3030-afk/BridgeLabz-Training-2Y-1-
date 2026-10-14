package Recursion;

public class XpowerN {
    public static int pow(int x,int n){
        //base case
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }

    static void main() {
        int x=2;
        int n=5;
        System.out.println(pow(x,n));
    }
}
