public class Stack<T> implements IStack<T> {
    
    private Node<T> first;
    private Node<T> last;


    @Override
    public void push (T value) {   
        Node<T> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrevious(last);
            last = newNode;
        }    

    }

    @Override
    public T pop() {
        if (first == null) {
            return null;
        } else {
            T value = last.getValue();
            last = last.getPrevious();
            if (last != null) {
                last.setNext(null);
            } else {
                first = null;
            }
            return value;
        }    
    }

    @Override
    public T operation(char operator, T value1, T value2) {
        switch (operator) {
            case '+':
                return (T) (Double) ((Double) value1 + (Double) value2);
            case '-':
                return (T) (Double) ((Double) value1 - (Double) value2);
            case '*':   
                return (T) (Double) ((Double) value1 * (Double) value2);
            case '/':
                return (T) (Double) ((Double) value1 / (Double) value2);
            case '%':       
                return (T) (Double) ((Double) value1 % (Double) value2);
            default:
                return null;
        
        }
    }
    
    public Node<T> getLast(){
        return this.last;
    }

}