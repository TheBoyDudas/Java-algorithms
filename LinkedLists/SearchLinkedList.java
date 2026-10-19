public class SearchLinkedList {

static class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public static void main(String[] args) {
  // create the nodes
  Node first = new Node(10);
  Node second= new Node(20);
  Node third = new Node(30);

  // connect them
  first.next = second;
  second.next = third;

  Node head = first;

  System.out.println(search(head, 20));  // true
  System.out.println(search(head, 50));  // false

}

public static boolean search(Node head, int target) {
  // start at the first node
  Node current = head;

  while (current != null) {
    if (current.data == target) {
      return true;
    }

    current = current.next;
  }

  // reached end without finding the target
  return false;
