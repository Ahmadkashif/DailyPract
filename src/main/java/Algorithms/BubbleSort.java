package Algorithms;

public class BubbleSort {

    public static int[] sort(int[] arr){

        int unsortedIndex = arr.length - 1;

        for(int i = 0; i < arr.length ;i++){
            for(int j= 0 ; j < unsortedIndex ; j++) {

                if(arr[j] > arr[ j+1 ]){

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    continue;
                }
            }
            unsortedIndex--;
        }
        return arr;
    }
}
