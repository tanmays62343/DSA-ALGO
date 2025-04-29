package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        bubbleSort(arr);
    }

    //? compare consecutive two elements from starting and if later is smaller, then swap it.
    //? after the first iteration the biggest number will come to last (its respective place) so that's done
    //? so now you do it till n-1 than n-2....n-3 and so on till the array.length iterations are complete
    //Time complexity - worst case O(n2)
    //Time complexity - best case O(n)
    static void bubbleSort(int [] arr){
        //Iterate the array from last Index to first Index
        for(int  i = arr.length-1; i>0; i--){
            boolean didSwap = false;    // to bring best case complexity to O(N)
            //Start comparing and swapping from first index to last index
            for(int j =0; j < i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
                if(!didSwap){
                    //If anything didn't swap in the 1st iteration means it is already sorted
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
