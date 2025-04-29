package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergerSort {

    public static void main(String[] args) {
        int [] arr = { 9, 4, 7, 6, 3, 1, 5 };
        mergerSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //? It's a divide and conquer algorithm we divide till end then sort and merge
    static void mergerSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergerSort(arr,low,mid);
        mergerSort(arr,mid+1,high);
        merger(arr,low,mid,high);
    }

    static void merger(int [] arr, int low, int mid, int high){

        ArrayList<Integer> temp = new ArrayList<>();
        //Left starting index pointer
        int left = low;
        //Right starting index pointer
        int right = mid+1;

        //Storing the elements in the temp arr in sorted manner
        while (left <= mid && right <= high){
            if(arr[left] <= arr [right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        //if Some elements on left half are still left
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        //if Some elements on right half are still left
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        //Transferring all the elements from temp arr to arr
        for(int i = low; i<=high; i++){
            arr[i] = temp.get(i- low);
        }

    }

}
