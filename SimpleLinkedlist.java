package telaphon;

public class SimpleLinkedlist {

    public SimpleNode tail;
    public SimpleNode head;

    public SimpleLinkedlist() {
        this.head = null;
        this.tail = null;
    }

    public SimpleNode insert(Object data) {
        SimpleNode newNode = new SimpleNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return newNode;
    }

    public void delete(SimpleNode node) {
        SimpleNode previousNode = null;
        SimpleNode currentNode = head;

        while (!currentNode.equals(node) && currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            return;
        } else if (previousNode == null) {
            head = currentNode.next;
            if (head == null) {
                tail = null;
            }
        } else {
            previousNode.next = currentNode;
            if (previousNode.next == null) {
                tail = previousNode;
            }
        }
    }

    public SimpleNode search(Object data) {
        SimpleNode node = head;
        while (!node.data.equals(data) && node != null) {
            node = node.next;
        }
        return node;
    }
}
