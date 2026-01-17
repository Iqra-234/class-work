//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(3);
         queue.enqueue(10);
         queue.enqueue(20);
         queue.enqueue(30);
         queue.printQueue();
         queue.dequeue();
         queue.printQueue();
         queue.enqueue(40);
         queue.printQueue();

         QueueLinkedList queuell=new QueueLinkedList();
         queuell.enqueue(30);
         queuell.enqueue(50);
         queuell.enqueue(40);
         queuell.printQueue();
         queuell.dequeue();
         queuell.printQueue();
         queuell.peek();
         queuell.printQueue();
    }}