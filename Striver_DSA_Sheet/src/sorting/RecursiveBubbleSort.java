package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void main(String[] args) {

        int [] arr = {13, 46, 24, 52, 20, 9};
        recursiveBubbleSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));

    }

    static void recursiveBubbleSort(int [] arr, int n){
        if(n == 1) return;

        for(int j =0; j<= n-2; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        recursiveBubbleSort(arr,n-1);

    }

}
