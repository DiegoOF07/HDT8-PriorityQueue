import java.util.LinkedList;

public class PriorityQueue<T extends Comparable<T>>{
    private Node<T> root;
    private LinkedList<T> queue;


    public PriorityQueue(){
        this.root = null;
        this.queue = new LinkedList<T>();
    }

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

    public void insert(T value){
        if(this.root == null){
            this.root = new Node<T>(value);
        }else{
            insert(value, this.root);
        }
    }

    public LinkedList<T> getQueue() {
        return getQueue(root);
    }

    private LinkedList<T> getQueue(Node<T> current) {
        if (current != null) {
            getQueue(current.getLeft());
            queue.offer(current.getValue());
            getQueue(current.getRight());
        }
        return queue;
    }

    public T remove(){
        if(!queue.isEmpty()){
            return queue.poll();
        }
        return null;
    }



}
