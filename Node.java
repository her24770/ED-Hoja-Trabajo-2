public class Node {
    private Node nextNode;
    private Node previousNode;
    private int value;

    public Node(Node nextNode, Node previousNode, int value) {
        this.nextNode = nextNode;
        this.previousNode = previousNode;
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
