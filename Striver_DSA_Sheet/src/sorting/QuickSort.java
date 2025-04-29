package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        arr = quickSort(arr);
        System.out.println(arr.toString());
    }

    //? Pick a pivot from the array place it at its correct position
    //? then place all the elements smaller than it on the left and greater once on the right
    //? do the same for every element in the array
    static List<Integer> quickSort(List<Integer> arr){
        qs(arr,0,arr.size()-1);
        return arr;
    }
    static void qs(List<Integer> arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr,low,high);
            qs(arr,low,pIndex -1);
            qs(arr,pIndex+1,high);
        }
    }
    static int partition(List<Integer> arr,int low, int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while(i < j){

            //Finding the element which is greater than pivot
            while(arr.get(i) <= pivot && i<=high-1){
                i++;
            }

            //Finding the element which is lesser than pivot
            while(arr.get(j) > pivot && j >= low+1){
                j--;
            }

            //Swap to create a sorted partition i.e. lowers on left and greater on right
            if(i < j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        //Now last step is to place the pivot at its correct position and get the partition index
        int temp = arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j, temp);
        return j;
    }

}
