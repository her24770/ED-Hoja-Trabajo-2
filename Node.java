public class Node<T> {




    private T value; // Valor del nodo
    private Node<T> next; 
    private Node<T> previous; 

    /**
     * Constructor de la clase Node
     * @param value Valor del nodo
     */

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

}

    
    

