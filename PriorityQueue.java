import java.util.ArrayList;

public class PriorityQueue<T extends Comparable<T>>{
    private Node<T> root;
    private ArrayList<T> queue;


    public PriorityQueue(){
        this.root = null;
        this.queue = new ArrayList<T>();
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

    public ArrayList<T> showQueue() {
        return showQueue(root);
    }

    private ArrayList<T> showQueue(Node<T> current) {
        if (current != null) {
            showQueue(current.getLeft());
            queue.add(current.getValue());
            showQueue(current.getRight());
        }
        return queue;
    }
}
