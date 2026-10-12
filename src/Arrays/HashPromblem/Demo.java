package Arrays.HashPromblem;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    static void main() {
        HashMap <Integer,Integer> map=new HashMap<>();
        int arr[]={1,1,1,1,2,2,3,3,3,3,5,5,5};
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                int val=map.get(arr[i]);
//                val++;
//                map.put(arr[i],val);
//            }else{
//                map.put(arr[i],1);
//            }
//        }



        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
    }
}
