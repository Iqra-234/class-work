//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            BSTRec tree = new BSTRec();

            tree.insert(50);
            tree.insert(30);
            tree.insert(70);
            tree.insert(20);
            tree.insert(40);
            tree.insert(60);
            tree.insert(80);

            System.out.println("Total Nodes: " + tree.countNodes());
            System.out.println("Leaf Nodes: " + tree.countLeafNodes());
            System.out.println("Valid BST: " + tree.isValidBST());

            System.out.println("Level Order Traversal:");
            tree.levelOrderTraversal();

            tree.delete(50);
            System.out.println("After Deleting 50:");
            tree.levelOrderTraversal();
        }
    }
