public class LinearSearchRecursion {
        // Recursive function
        public static int linearSearchRec(int[] arr, int target, int index) {

            // base case: index out of range
            if(index == arr.length) {
                return -1;   // not found
            }

            // check current element
            if(arr[index] == target) {
                return index;
            }

            // recursive call for next index
            return linearSearchRec(arr, target, index + 1);
        }

        // Main function
        public static void main(String[] args) {

            int[] arr = {5, 12, 7, 25, 3};
            int target = 7;

            int result = linearSearchRec(arr, target, 0);

            if(result == -1)
                System.out.println("Element not found");
            else
                System.out.println("Found at index: " + result);
        }
    }

