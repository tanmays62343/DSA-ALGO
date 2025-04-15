package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestNLowestFrq {

    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        giveHighestNLowestFrq(arr);
    }


    //Time Complexity = O(n)
    static void giveHighestNLowestFrq(int [] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i],1);
            }
        }

        int highest = -1;
        int lowest = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(highest < entry.getValue()){
                highest = entry.getKey();
            }
            if(lowest > entry.getValue()){
                lowest = entry.getKey();
            }
        }

        System.out.println("Highest Frequency: "+highest+" Lowest Frequency: "+lowest);

    }

}
