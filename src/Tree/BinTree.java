package Tree;

import java.util.*;

/**
 * @author MOUDDENE HAMZA
 */
public class BinTree<T extends Comparable<T>> {

    /**
     * Attributes of the class
     *
     * @param root : Represents the root of the binary tree
     * @param typeBrowse : Represents the type of the browsing binary tree
     */
    protected Node<T> root;
    //protected TypeBrowse typeBrowse;

    /**
     * Constructor of the class
     */
    public BinTree() {
        this.root = null;
        //this.typeBrowse = null;
    }

    /**
     * Get the root node
     *
     * @return Node<T> : a root node
     */
    public Node<T> getRoot() {
        return this.root;
    }

    /**
     * Set the subtree into the tree left son
     */
    public void setRoot(Node<T> root) {
        this.root = root;
    }

    /**
     * Checks if the tree is empty
     *
     * @return boolean : True, if the tree is empty, otherwise, false.
     */
    public boolean isEmpty() {
        return (root == null);
    }

    /**
     * Add a value to the binary tree
     *
     * @param value
     */
    public void add(T value) {
        if (isEmpty()) {//If the tree is void
            root = new Node(value, null, null);
            return;
        } else {//if the tree is not void
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node<T> n = q.poll();
                if (n.getLeftSon() != null && n.getRightSon() != null) {
                    q.add(n.getLeftSon());
                    q.add(n.getRightSon());
                } else {
                    if (n.getLeftSon() == null) {
                        n.setLeftSon(new Node(value, null, null));
                    } else {
                        n.setRightSonSon(new Node(value, null, null));
                    }
                    break;
                }
            }
        }
    }

    /**
     * Inner class handling the inorder traversal across the tree
     *
     * @param <T>
     */
    private class InorderTraversal<T extends Comparable<T>> implements Iterator<T> {

        /**
         * Attributes of the class
         *
         * @param next : Represents the next node of the binary tree
         */
        private Node<T> next;

        public InorderTraversal(Node<T> root) {
            next = root;
            if (next == null)
                return;
            while (next.getLeftSon() != null)
                next = next.getLeftSon();
        }

        /**
         * Returns true if the iteration has more elements.
         *
         * @return boolean
         */
        public boolean hasNext() {
            return next != null;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return item of type T
         */
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            Node<T> n = next;

            // If you can walk right, walk right, then fully left.
            // otherwise, walk up until you come from left.
            if (next.getRightSon() != null) {
                next = next.getRightSon();
                while (next.getLeftSon() != null)
                    next = next.getLeftSon();
                return n.getValue();
            }
            while (true) {
                if (root == null) {
                    return null;
                }
                if (root.getLeftSon() == next) {
                    next = (Node<T>) root;
                    return n.getValue();
                }
                next = (Node<T>) root;
            }
        }
    }

    /**
     * Inner class handling the Pre-order Traversal across the tree
     *
     * @param <T>
     */
    private class PreOrderTraversal<T extends Comparable<T>> implements Iterator<T> {

        /**
         * Attributes of the class
         *
         * @param next : Represents the next node of the binary tree
         */
        private Stack<Node<T>> stack;

        /**
         * Constructor of the class
         */
        public PreOrderTraversal() {
            stack = new Stack<>();
            stack.add((Node<T>) root);
        }

        /**
         * Returns true if the iteration has more elements.
         *
         * @return boolean
         */
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return item of type T
         */
        public T next() {
            if (!hasNext()) throw new NoSuchElementException("No more nodes remain to iterate");
            Node<T> node = stack.pop();
            if (node.getRightSon() != null) stack.push(node.getRightSon());
            if (node.getLeftSon() != null) stack.push(node.getLeftSon());
            return node.getValue();
        }
    }

    /**
     * Inner class handling the infix browse across the tree
     *
     * @param <T>
     */
    private class PostfixeBrowse<T extends Comparable<T>> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    /**
     * String representing the status of the tree
     *
     * @return str : value of the tree
     */
    public String toString() {
        String str = "";
        return str;
    }

    /**
     * Checks if two tree are equal
     *
     * @param o is a parameter analogous to a tree
     * @return boolean : true if the two tree are equals, otherwise, false
     */
    public boolean equals(Object o) {
        return false;
    }
}