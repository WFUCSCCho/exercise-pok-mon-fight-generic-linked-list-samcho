
/* Class: LinkedList
 * Authors:
 */

public class LinkedList <T extends Comparable <T>> {
    private static class Node <T extends Comparable <T>> {
        T mon; // object in node
        Node<T> next; // next Node in linked list

        // default constructor
        public Node() {
            mon = null;
            next = null;
        }
        // constructor
        public Node(T m, Node<T> n) {
            mon = m;
            next = n;
        }
    }
    private Node<T> head; // first node in linked list

    // default constructor
    LinkedList() {
        head = null;
    }

    public void print() {
        Node<T> runner = head; // start at the head
        while (runner.next != null) { // keep going until the end
            System.out.println(runner.mon); // print Pokémon
            runner = runner.next; // go to next node
        }
    }

    // find a node, return whether found or not
    public boolean find(T mon) {
        Node<T> runner = head;
        while (runner != null) {
            if (runner.mon.equals(mon)){
                return true;
            }
            else {
                runner = runner.next;
            }
        }
        return false;
    }

    // Insert a node at the end of the list
    public void insert(T mon) {
        Node<T> newNode = new Node<T>();
        newNode.mon = mon;

        if (head == null) {
            head = newNode;
        }
        else if (head.mon.compareTo(mon) >= 0){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node<T> runner = head.next;
            Node<T> previous = head;
            while (runner != null && runner.mon.compareTo(mon) < 0) {
                previous = runner;
                runner = runner.next;
            }
            newNode.next = runner;
            previous.next = newNode;
        }
    }

    // Delete a node at the beginning of the Linked List and return it
    public T pop () {
        if(head != null){
             T poke = head.mon;
             head = head.next;
             return poke;
        }
        return null;
    }
}
