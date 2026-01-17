public class Main {
    public static void main(String[] args) {
        MyArray numbers = new MyArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40); // full
        numbers.print();
        DynamicArray num = new DynamicArray(2);
        num.insert(10);
        num.insert(20);
        num.insert(30); // triggers resize
        num.insert(40);
        num.print();
        num.removeAt(1);
        num.print();
    }
}
