
/* Class: LinkedList
 * Authors:
 */

public class LinkedList {
    private static class Node {
        Pokemon mon; // object in node
        Node next; // next Node in linked list

        // default constructor
        public Node() {
            mon = new Pokemon();
            next = null;
        }
        // constructor
        public Node(Pokemon m, Node n) {
            mon = m;
            next = n;
        }
    }
    private Node head; // first node in linked list

    // default constructor
    LinkedList() {
        head = null;
    }

    public void print() {
        Node runner = head; // start at the head
        while (runner.next != null) { // keep going until the end
            System.out.println(runner.mon); // print Pokémon
            runner = runner.next; // go to next node
        }
    }

    // find a node, return whether found or not
    public boolean find(Pokemon mon) {
    Node runner = head;
    while (runner != null) {
        if (runner.mon.equals(mon)){
            return true;
        }
        else {
            runner = runner.next;
        }
    }
    return false;
    /*
    for (int i; i < ; i++) {
        if () {
            return true;
        }
        else {
            return false;
        }
    }
     */
}
    // Insert a node at the end of the list
    public void insert(Pokemon mon) {
        Node newNode = new Node();
        newNode.mon = mon;

        if (head == null) {
            head = newNode;
        }
        else if (head.mon.compareTo(mon) >= 0){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node runner = head.next;
            Node previous = head;
            while (runner != null && runner.mon.compareTo(mon) < 0) {
                previous = runner;
                runner = runner.next;
            }
            newNode.next = runner;
            previous.next = newNode;
        }
    }

    // Delete a node at the beginning of the Linked List and return it
    public Pokemon pop () {
        // FINISH ME
        if(head != null){
             Pokemon poke = head.mon;
             head = head.next;
             return poke;
        }
        return null;
    }
}
