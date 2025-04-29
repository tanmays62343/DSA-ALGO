package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        insertionSort(arr);
    }

    //? It takes an element and places it on its correct position
    //Time complexity = worst O(n2)
    //Time complexity = best O(n)
    static void insertionSort(int [] arr){
        //Iterate through the entire array
        for(int i=0; i < arr.length; i++){
            int j = i;
            //Place the element on its correct position
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
