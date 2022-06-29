
public class AVL <T extends Comparable<T>> {
    private Node<T> root;
    
    public AVL() {
        this.root = null;
    }
    
    public void updateHeight(Node<T> node) {
        if (node == null) {
            System.out.print(""); //no hace nada 
        } else if (node.getRightNode() == null) {
            node.setHeight(height(node.getLeftNode())+1);
        } else if (node.getLeftNode() == null){
           node.setHeight(height(node.getRightNode())+1);
        } else {
            node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1); 
        }
        
    }
    
    public int height(Node<T> node) {
        if (node == null) {
            return -1;
        }
        return node.getHeight();
    }
    
    public int factorEquil(Node<T> node) {
        
        if (node == null) {
            return 0;
        } else if (node.getRightNode() == null) {
            return height(node.getLeftNode());
        } else if (node.getLeftNode() == null){
            return height(node.getRightNode());
        } else {
            return height(node.getRightNode()) - height(node.getLeftNode());
        }
    }
    
    private Node<T> RSR(Node<T> node){
        Node<T> leftChild = node.getLeftNode();
        node.setLeftNode(leftChild.getRightNode());
        leftChild.setRightNode(node);
        
        updateHeight(node);
        updateHeight(leftChild);
        return leftChild;
    }
    
    public Node<T> RSL(Node<T> node){
        Node<T> rightChild = node.getRightNode();
        node.setRightNode(rightChild.getLeftNode());
        rightChild.setLeftNode(node);
        
        updateHeight(node);
        updateHeight(rightChild);
        
        return rightChild;
    }
    
    private Node<T> RDR(Node<T> node){
        node.setLeftNode(RSL(node.getLeftNode()));
        return RSR(node);
    }
    
    private Node<T> RDL(Node<T> node){
        node.setRightNode(RSR(node.getRightNode()));
        return RSL(node);
    }
    
    public void insert(T x) {
        this.root = insertNode(x, this.root);
    }
    
    public Node<T> insertNode(T x, Node<T> actual) {
        Node<T> res = actual;
        if (actual == null) {
            res = new Node<T>(x);
        } else {
            int resC = actual.getDato().compareTo(x);
            
            if (resC == 0){
                System.out.println(x+" duplicado");
                return null;
            }
            if (resC < 0) {
                res.setRightNode(insertNode(x, actual.getRightNode()));
            } else {
                res.setLeftNode(insertNode(x, actual.getLeftNode()));
            }            
        }
        
        updateHeight(res);
        return reequilibracion(res);
    }
    
    public void remove(T x) {
        this.root = removeNode(x, this.root);
    }
    
    public Node<T> removeNode(T x, Node<T> actual) {
        Node<T> res = actual;
        if (actual == null) {
            return null;
        }
        
        int resC = actual.getDato().compareTo(x);
        
        if (resC < 0) {
            res.setRightNode(removeNode(x, actual.getRightNode()));
        } else if (resC > 0) {
            res.setLeftNode(removeNode(x, actual.getLeftNode()));
        } else if(actual.getLeftNode() != null && actual.getRightNode() != null) {
            res.setDato(minRecover(actual.getRightNode()).getDato());
            res.setRightNode(minRemove(actual.getRightNode()));
        } else {
            res = (actual.getLeftNode() != null) ? actual.getLeftNode() : actual.getRightNode();
        }
        
        updateHeight(res);
        return reequilibracion(res);
    }
    
    public Node<T> minRemove(Node<T> actual) {
        if (actual.getLeftNode() != null) {
            actual.setLeftNode(minRemove(actual.getLeftNode()));
        } else {
            actual = actual.getRightNode();
        }
        return actual;
    }
    
    public Node<T> minRecover(Node<T> actual) {
        if (actual.getLeftNode() == null) {
            return actual;
        }
        return minRecover(actual.getLeftNode());
    }
    
    public Node<T> reequilibracion(Node<T> node) {
        
        if(node == null) {
            return null;
        }
        
        int fe = factorEquil(node); 
        node.setBalanceFactor(fe);
        
        if (fe < -1) {
            if (factorEquil(node.getLeftNode()) <= 0) {
                node = RSR(node);
            } else {
                node = RDR(node);
            }
        }
        if (fe > 1) {
            if (factorEquil(node.getLeftNode()) <= 0) {
                node = RSL(node);
            } else {
                node = RDL(node);
            } 
        }
        return node;
    }
    
    public T search(T x) {
        Node<T> res = searchNode(x, root);
        if (res == null){
            System.out.println(x+" no encontrado");
            return null;
        }
        return res.getDato();
    }
    
    public Node<T> searchNode(T x, Node<T> n){
        if (n == null){
            return null;
        } else {
            int resC = n.getDato().compareTo(x);
            if (resC < 0) {
                return searchNode(x, n.getRightNode());
            } else if (resC > 0) {
                return searchNode(x, n.getLeftNode());
            } else {
                return n;
            }    
        }
    }
    
    public void mostrarInOrden(){
        mostrarInOrden(root);
    }
    public void mostrarInOrden(Node<T> node){
 
        if(node.getLeftNode() != null) {
            mostrarInOrden(node.getLeftNode());
        }
        System.out.print(node.getDato()+" ");
        
        if(node.getRightNode() != null) {
            mostrarInOrden(node.getRightNode());
        }
    }
}
