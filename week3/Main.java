package LinkedList1;
  class main {
    public static void main(String[] args) {
        LL list=new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst("this");
        list.printList();


        list.removeLast("list");
        list.printList();

    }

}

