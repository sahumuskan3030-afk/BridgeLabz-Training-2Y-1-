package PracticeQues;

public class Occurance {
    public static int first=-1;
    public static int last=-1;
    public static void occur(String s,int idx) {

        //base case
        if (s.length() == idx) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char occurance = s.charAt(idx);


        if (s.charAt(idx) == occurance) {
            if (first == -1) {
                first = idx;
            }
        else {
            last = idx;
        }
    }
        occur(s,idx+1);

    }
    static void main() {
        String s="muskan";
        occur(s,0);
    }
}
