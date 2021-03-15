package Algorithms;

public class BubbleSort {

    public static int[] sort(int[] arr){

        int unsortedIndex = arr.length - 1;

        for(int i = 0; i < arr.length ;i++){
            for(int j= 0 ; j < unsortedIndex; j++) {

                if((i+1) < arr.length) {

                    if(arr[i] > arr[ i+1 ]){
                        int temp = arr[i+1];
                        arr[i+1] = arr[i];
                        arr[i] = temp;
                    }
                }
                else{
                    continue;
                }
            }
        }
        return arr;
    }
}
