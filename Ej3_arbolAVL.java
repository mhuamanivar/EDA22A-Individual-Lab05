
public class Ej3_arbolAVL {
    
    public static void main(String [] args) {
        AVL<Integer> tree = new AVL<Integer>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(4);
        tree.insert(5);
        tree.insert(0);
        
        tree.mostrarInOrden();
        System.out.println("");
        
        tree.remove(5);
        tree.remove(2);
        tree.remove(4);
        tree.mostrarInOrden();
    }
}
