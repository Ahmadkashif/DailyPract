package Algorithms;

public class InsertionSort {

    public static int[] sort(int[] arr){
        int SPI = 0;
        for(int j = SPI ;j<arr.length-1;j++){

            if(arr[j] <= arr[j+1]){
                SPI++;
            }
            else if(arr[j] > arr[j+1] )
            {
                SPI++;
                int i = j;
                int jtemp;
                jtemp = j + 1;
                int newOne = arr[j+1];
                while( i >= 0 && arr[ i ] < newOne ) {
                    int temp = arr[i];
                    arr[i--] = newOne;
                    arr[jtemp--] = temp;
                }
            }
        }
        return arr;
    }
}
