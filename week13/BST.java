public class BST {
        private Node root;
    class Node {
        int value;
        Node leftChild;
        Node rightChild;

        Node(int value) {
            this.value = value;
            leftChild = null;
            rightChild = null;
        }
    }
    public void insert(int value) {
        if (root == null) {          // Empty BST
            root = new Node(value);
            System.out.println("Inserted: " + value);
            return;
        }

        Node current = root;

        while (true) {

            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    System.out.println("Inserted: " + value);
                    break;
                }
                current = current.leftChild;
            }

            else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    System.out.println("Inserted: " + value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }
    public boolean search(int value) {

            Node current = root;

            while (current != null) {

                if (value == current.value)
                    return true;

                if (value < current.value)
                    current = current.leftChild;
                else
                    current = current.rightChild;
            }

            return false;
        }

public static void main(String[] args) {

    BST tree = new BST();

    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(20);
    tree.insert(40);
    tree.insert(60);
    tree.insert(90);
    tree.search(70);
    System.out.println("Searching 70: " + tree.search(70));
    System.out.println("Searching 100: " + tree.search(100));


}}

