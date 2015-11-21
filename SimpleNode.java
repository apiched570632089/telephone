package telaphon;

public class SimpleNode {

    public int value;
    public int impleNode;
    public Object data;
    public SimpleNode next;

    public SimpleNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return data.toString();
    }

    public class CircularLinkedList {

        public SimpleNode head;
        public SimpleNode tail;

        public SimpleNode insert(int value) {
            SimpleNode newNode = new SimpleNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;
            }
            return newNode;
        }

        public void delete(SimpleNode node) {
            SimpleNode perviousNode = null;
            SimpleNode currentNode = head;
            while (!currentNode.equals(node) && perviousNode != tail) {
                perviousNode = currentNode;
                currentNode = currentNode.next;
            }
            if (perviousNode == tail) {
                return;
            } else if (perviousNode == null) {
                head = currentNode.next;
                if (currentNode.next == currentNode) {
                    head = null;
                    tail = null;
                } else {
                    head = currentNode.next;
                    tail.next = head;
                }
            } else {
                perviousNode.next = currentNode.next;
                if (perviousNode.next == head) {
                    tail = perviousNode;
                }
            }
        }

        public SimpleNode search(int value) {
            SimpleNode previousNode = null;
            SimpleNode node = head;
            while (node != null && previousNode != tail && node.value != value) {
                previousNode = node;
                node = node.next;
            }
            if (previousNode == tail) {
                return null;
            } else {
                return node;
            }
        }
    }
}
