import java.util.LinkedList;

/**
 * @author Diego Flores 23714
 * Clase encargada de modelar a la cola de prioridad
 */
public class PriorityQueue<T extends Comparable<T>>{
    private Node<T> root;
    private LinkedList<T> queue;

    /**
     * @description Constructor de la clase
     */
    public PriorityQueue(){
        this.root = null;
        this.queue = new LinkedList<T>();
    }

    /**
     * @description Metodo recursivo que inserta los pacientes en el arbol
     * @param value
     * @param current
     */
    private void insert(T value, Node<T> current){
        if(value.compareTo(current.getValue())<=0){
            if(current.getLeft()==null){
                current.setLeft(new Node<T>(value));
            }else{
                insert(value, current.getLeft());
            }
        }else if(value.compareTo(current.getValue())>0){
            if(current.getRight()==null){
                current.setRight(new Node<T>(value));
            }else{
                insert(value, current.getRight());
            }
        }
    }

    /**
     * @description Metodo que esta disponible para insertar pacientes
     * @param value
     */
    public void insert(T value){
        if(this.root == null){
            this.root = new Node<T>(value);
        }else{
            insert(value, this.root);
        }
    }

    /**
     * @description Devuelve la cola ordenada por prioridad
     * @return LinkedList<T>
     */
    public LinkedList<T> getQueue() {
        return getQueue(root);
    }

    /**
     * @description Metodo recursivo que obtiene todo los elementos de la cola
     * @param current
     * @return LinkedList<T>
     */
    private LinkedList<T> getQueue(Node<T> current) {
        if (current != null) {
            getQueue(current.getLeft());
            queue.offer(current.getValue());
            getQueue(current.getRight());
        }
        return queue;
    }

    /**
     * @description Metodo que obtiene y elimina al primer paciente de la cola
     * @return T
     */
    public T remove(){
        if(!queue.isEmpty()){
            return queue.poll();
        }
        return null;
    }



}
