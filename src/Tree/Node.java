package Tree;

import Queue.ChainedQueue;
import Stack.Stack;

/**
 * @author MOUDDENE HAMZA
 * @param <T>
 */
public class Node<T extends Comparable<T>> {

    /**
     * Attibutes of this class
     *
     * @param value is a value of type T
     * @param leftSon is a reference of the left son of the tree
     * @param rightSon is a reference of the right son of the tree
     */
    protected Node<T> leftSon;
    protected Node<T> rightSon;
    protected T value;

    /**
     * Constructor of the class
     */
    public Node(T value, Node<T> leftSon, Node<T> rightSon) {
        this.value = value;
        this.leftSon = leftSon;
        this.rightSon = rightSon;
    }

    /**
     * Get the value from the tree
     * @return integer : an item of T type
     */
    public T getValue() {
        return this.value;
    }

    /**
     * Set the value into the tree
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Get the left son from the tree
     * @return Node<T> : a subtree
     */
    public Node<T> getLeftSon() {
        return this.leftSon;
    }

    /**
     * Set the subtree into the tree left son
     */
    public void setLeftSon(Node<T> leftSon) {
        this.leftSon = leftSon;
    }

    /**
     * Get the left son from the tree
     * @return Node<T> : a subtree
     */
    public Node<T> getRightSon() {
        return this.leftSon;
    }

    /**
     * Set the subtree into the tree left son
     */
    public void setRightSonSon(Node<T> rightSon) {
        this.rightSon = rightSon;
    }

    /**
     * Check if the value given in the parameter is in the tree
     * @param value
     * @return boolean : True if it is in the tree, otherwise, false
     */
    protected boolean contains(T value) {
        if (this.value == null) {
            return false;
        }
        if (this.value == value) {
            return true;
        }
        return contains(this.leftSon.value) || contains(this.rightSon.value);
    }

    /**
     * Calculation of the maximal depth of the tree
     * @return integer : representing the depth of the tree
     */
    public int getDepth() {
        int depth = 0;
        if (this.value == null) {
            return depth;
        } else {
            depth++;
        }
        return Math.max(leftSon.getDepth(), rightSon.getDepth());
    }

    /**
     * String representing the status of the tree
     * @return str : value of the node
     */
    public String toString() {
        String str = "";
        if (this.value == null) {
            str += "]";
        } else {
            str += this.value;
        }
        return str;
    }

    /**
     * Checks if two tree are equal
     * @param o is a parameter analogous to a tree
     * @return boolean : true if the two tree are equals, otherwise, false
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        Node<T> n = (Node<T>) o;
        return this.value == ((Node<T>) o).getValue();
    }
}
