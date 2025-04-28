package basics.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        selectionSort(arr);
    }


    //? Take the minimum from the array and swap it to the front side, keep on doing it until array.length
    // Time Complexity - O(n2)
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimumIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                //Find the smallest from the array
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            //Swap
            if(minimumIndex != i){
                int temp = arr[minimumIndex];
                arr[minimumIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Dry run-

    //initial - {13,46,24,52,20,9}
    //Step 1 - {9,46,24,52,20,13}
    //Step 2 - {9,13,24,52,20,46}
    //Step 3 - {9,13,20,52,24,46}
    //Step 4 - {9,13,20,24,52,46}
    //Step 5 - {9,13,20,24,46,52}

}
