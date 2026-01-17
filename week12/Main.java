import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
