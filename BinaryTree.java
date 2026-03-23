public class BinaryTree<E extends Comparable<E>> {

    private class Node {
        E value;
        Node left, right;

        public Node(E value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        root = null;
    }

    // INSERT
    public void insert(E value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node current, E value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.compareTo(current.value) < 0) {
            current.left = insertRec(current.left, value);
        } else {
            current.right = insertRec(current.right, value);
        }

        return current;
    }

    // SEARCH
    public E search(E value) {
        return searchRec(root, value);
    }

    private E searchRec(Node current, E value) {
        if (current == null) return null;

        int cmp = value.compareTo(current.value);

        if (cmp == 0) return current.value;
        else if (cmp < 0) return searchRec(current.left, value);
        else return searchRec(current.right, value);
    }

    // IN-ORDER
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node current) {
        if (current != null) {
            inOrderRec(current.left);
            System.out.println(current.value);
            inOrderRec(current.right);
        }
    }
}