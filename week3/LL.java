package LinkedList1;
    public class LL {
        Node head;
        private int size;
        LL(){
            size=0;
        }
        public class Node{
            String data;
            Node next;

            public Node(String data) {
                this.data = data;
                this.next = null;
                size++;
            }
        }
        public void addFirst(String data){
            Node newNode=new Node(data);
            newNode.next =head;
            head =newNode;
        }
        public void addLast(String data){
            Node newNode=new Node(data);
            if(head ==null){
                head=newNode;
                return;
            }
            Node lastNode=head;
            while(lastNode.next !=null){
                lastNode =lastNode.next;
            }
            lastNode.next=newNode;
        }
        public void printList(){
            Node currNode=head;
            while(currNode !=null){
                System.out.print(currNode.data + " -> ");
                currNode =currNode.next;
            }
            System.out.println("null");
        }
        public void removeFirst(String data){
            if(head==null){
                System.out.println("Empty list, nothing to delete ");
                return;
            }
            head= this.head.next;
            size--;
        }
        public void removeLast(String data){
            if(head==null){
                System.out.println("Empty list,nothing to delete");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node currNode=head;
            Node lastNode=head.next;
            if(lastNode !=null){
                currNode =currNode.next;
                lastNode=lastNode.next;
            }
            currNode.next=null;
        }
        public int getSize(){
            return size;
        }

    }


