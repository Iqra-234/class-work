//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            DoublyLL dll = new DoublyLL();

            dll.addFirst(20);
            dll.addFirst(10);
            dll.addLast(30);

            dll.printForward();
            dll.printBackward();

            dll.deleteFirst();
            dll.printForward();

            dll.deleteLast();
            dll.printForward();

            dll.deleteByValue(10);
            dll.printForward();

            dll.reverseDLL();
            dll.printForward();
        }
    }
