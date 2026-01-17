public class BSTRec {
        private Node root;
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.value)
            root.left = insertRec(root.left, value);
        else
            root.right = insertRec(root.right, value);

        return root;
    }
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null)
            return false;

        if (root.value == value)
            return true;

        if (value < root.value)
            return searchRec(root.left, value);
        else
            return searchRec(root.right, value);
    }
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null)
            return null;

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        }
        else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        }
        else {
            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Case 3: Two children
            int successorValue = findMin(root.right);
            root.value = successorValue;
            root.right = deleteRec(root.right, successorValue);
        }
        return root;
    }
    private int findMin(Node root) {
        if (root.left == null)
            return root.value;
        return findMin(root.left);
    }
    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodesRec(root.left) + countNodesRec(root.right);
    }
    public int countLeafNodes() {
        return countLeafRec(root);
    }

    private int countLeafRec(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        return countLeafRec(root.left) + countLeafRec(root.right);
    }
    public boolean isValidBST() {
        return isValidBSTRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBSTRec(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.value <= min || root.value >= max)
            return false;

        return isValidBSTRec(root.left, min, root.value) &&
                isValidBSTRec(root.right, root.value, max);
    }
    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(heightRec(root.left), heightRec(root.right));
    }
    private void printLevel(Node root, int remainingDepth) {
        if (root == null)
            return;

        if (remainingDepth == 1)
            System.out.print(root.value + " ");
        else {
            printLevel(root.left, remainingDepth - 1);
            printLevel(root.right, remainingDepth - 1);
        }
    }
    public void levelOrderTraversal() {
        int h = height();
        for (int i = 1; i <= h; i++) {
            printLevel(root, i);
            System.out.println();
        }
    }
    }

