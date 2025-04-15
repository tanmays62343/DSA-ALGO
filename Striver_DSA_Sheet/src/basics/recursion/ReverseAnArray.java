package basics.recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int [] arr,int start, int end){
        if(start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverse(arr,start+1,end-1);
        }
    }

}
