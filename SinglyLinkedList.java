public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        // your code here
        head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head == null)
            // the list is empty
            return;
        if (head.next == null) {
            // only one element in the list, remove it
            head = null;
            return;
        }
        //handles more than 1 element in the list
        Node runner = head;
        Node previous = head;
        while (runner.next != null) {
            // to keep a copy of the penultimate node
            // will become the last node
            previous = runner; 

            runner = runner.next;
        }
        // the penultimate node becomes the last one,
        // which means we are removing the last node
        previous.next = null;

    }

    public void printValues() {
        Node runner = head;
        if (runner == null) {
            System.out.println("List is empty");
            return;
        }
        while (runner.next != null) {
            System.out.println("Value is: " + runner.value);
            runner = runner.next;
        }
        // prints the very last node's value
        System.out.println("Value is: " + runner.value);
    }
}
