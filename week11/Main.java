//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10, 12, 14};
        int index = BinarySearchRecursive.binarySearchRecursive(arr1, 0,arr1.length-1,10);
        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);
    }
}





