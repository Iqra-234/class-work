import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1};
        BubbleSort.bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        System.out.println("Selection Sorted Array: " + Arrays.toString(arr));
        InsertionSort.insertionSort(arr);
        System.out.println("Insertion Sorted Array: " + Arrays.toString(arr));
    }
}



