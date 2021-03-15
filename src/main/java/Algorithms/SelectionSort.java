package Algorithms;

public class SelectionSort {

    public static int[] sort(int[] arr){

        int sortedPartitionIndex = arr.length - 1 ;

        for (int j = 0  ; j < arr.length; j++){

            int largestIndex = 0;
            for (int i = 1; i <= sortedPartitionIndex ; i++){

                if( arr[largestIndex] < arr[i])
                    largestIndex = i;
                else
                    continue;
            }
            if (sortedPartitionIndex == 0)
                return arr;

            int temp = arr[largestIndex];
            arr[largestIndex] = arr[sortedPartitionIndex] ;
            arr[sortedPartitionIndex] = temp;
            sortedPartitionIndex--;
        }
        return arr;
    }
}
