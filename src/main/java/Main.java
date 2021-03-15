import Algorithms.BubbleSort;
import Algorithms.InsertionSort;
import Algorithms.SelectionSort;
import Algorithms.StringSplitter;

public class Main {

    public static void main(String[] args){
        String[] str = StringSplitter.solution("");
        int[] arr = new int[]{1, 4, 5, 7, 8, 9, 5, 7, 3, 2};

        for(int x: InsertionSort.sort(arr)){
            System.out.println(x+" ");
        };

    }

}
