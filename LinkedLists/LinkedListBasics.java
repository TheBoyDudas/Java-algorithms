public class LinkedListBasics {

static class Node {
  int data;  // value stored in this node
  Node next;  // reference to the next node

  Node (int data) {
    this.data = data;
    this.next = null; // no next node connected yet
  }
}

public static void main(String[] args) {
  // create three separate nodes
  Node first = new Node(10);
  Node second = new Node(20);
  Node third = new Node(30);

  // connect the nodes
  first.next = second;
  second.next = third;
  // third.next stays null as it is the last node

  // head is first node in the list
  Node head = first;
  Node current = head;

  while (current != null) {
    System.out.println(current.data);

    // move to next node
    current = current.next;
    }
  }

}
