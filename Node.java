/**
 * @author Diego Flores 23714
 * Clase encargada de modelar a los nodos para la cola
 */
public class Node<T> {
    
    private T value;
    private Node<T> left;
    private Node<T> right;
    
    /**
     * @description Constructor de la clase
     * @param value
     */
    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     * @description Obtiene el valor del nodo
     * @return T
     */
    public T getValue() {
        return value;
    }

    /**
     * @description Asigna el valor del nodo
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @description Obtiene el nodo a la izquierda
     * @return Node<T>
     */
    public Node<T> getLeft() {
        return left;
    }

    /**
     * @description Asigna el nodo a la izquierda
     * @param left
     */
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    /**
     * @description Obtiene el nodo a la derecha
     * @return Node<T>
     */
    public Node<T> getRight() {
        return right;
    }

    /**
     * @description Asigna el nodo a la derecha
     * @param right
     */
    public void setRight(Node<T> right) {
        this.right = right;
    }
    
}
