package PracticeQues;

public class TowerHanoi {
    public static void place(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return ;
        }
        //isme first one disk ko chodkr
        // sari ko source se helper pr transfer kro
        place(n-1,source,destination,helper);
        //y hamara source to helper aa jayge phir (helper=destination bn jayga )
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        place(n-1,helper,source,destination);

    }

    static void main() {
        int n=3;
       place(n,"A","B","C");
    }
}
