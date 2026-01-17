public class DynamicArray {
        private int[] items;
        private int count;

        public DynamicArray(int length) {
            items = new int[length];
        }

        public void insert(int value) {
            // if full, resize
            if (count == items.length) {
                int[] newItems = new int[count * 2];
                for (int i = 0; i < count; i++)
                    newItems[i] = items[i];
                items = newItems;
                System.out.println("Array resized to " + items.length);
            }
            items[count++] = value;
        }

        public void print() {
            for (int i = 0; i < count; i++)
                System.out.print(items[i] + " ");
            System.out.println();
        }

public void removeAt(int index) {
    if (index < 0 || index >= count) {
        System.out.println("Invalid index!");
        return;
    }
    for (int i = index; i < count - 1; i++)
        items[i] = items[i + 1];
    count--;
}}



