public class BinaryTree {

  
// represents a single node in the tree
static class Node {
  int data; // Value stored in the node
  Node left; // Reference to the left child
  Node right; // Reference to the right child


  // constructor to create a new node
  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

public static void main(String[] args) {

  // Create the root node
  Node root = new Node(10);
  
  // Add left and right children to the root
  root.left = new Node(5);
  root.right = new Node(15);

  // Add two children to node 5
  root.left.left = new Node(2);
  root.left.right = new Node(7);
