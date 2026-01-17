public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {

        if(low > high) return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == target) return mid;

        if(target < arr[mid])
            return binarySearchRecursive(arr, low, mid - 1, target);

        return binarySearchRecursive(arr, mid + 1, high, target);
    }
}
