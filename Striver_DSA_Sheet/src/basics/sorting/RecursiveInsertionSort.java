package basics.sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {

    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};

        recursiveInsertionSort(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));

    }

    static void recursiveInsertionSort(int [] arr, int i, int n){

        if(i == n) return;

        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveInsertionSort(arr,i+1,n);
    }

}
