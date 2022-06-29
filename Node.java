public class Node <T> {
    private T dato;
    private Node<T> leftNode;
    private Node<T> rightNode;
    private int balanceFactor;
    private int height;

    public Node(T dato) {
        this.dato = dato;
    }

    public Node(T dato, Node<T> leftNode, Node<T> rightNode) {
        this.dato = dato;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node(T dato, Node<T> leftNode, Node<T> rightNode, int balanceFactor) {
        this.dato = dato;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.balanceFactor = balanceFactor;
    }

    public T getDato() {
        return dato;
    }

    public int getHeight() {
        return height;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public int getBalanceFactor() {
        return balanceFactor;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public void setBalanceFactor(int balanceFactor) {
        this.balanceFactor = balanceFactor;
    }
}