package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequencies {

    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        countFrequencies(arr,10);
    }

    //Hashing by using map
    //Complexity O(n)
    static void countFrequencies(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i],1);
            }
        }
        System.out.println("Frequency of the number"+ n + " is: "+map.get(n));
    }

}
