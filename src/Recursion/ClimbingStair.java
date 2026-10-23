package Recursion;

import java.util.Arrays;

public class ClimbingStair {
    public static int climb(int n,int[] dp){
        //base case
         if(n<=2){
             return n;
         }

         if(dp[n]!=-1) return dp[n];
         int pick=climb(n-1,dp);
         int skip=climb(n-2,dp);
         return pick+skip;
    }

    static void main() {

        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climb(n,dp));
    }
}
