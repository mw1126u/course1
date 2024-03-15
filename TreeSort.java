public class TreeSort {

//Node class representing each element in the linked list

private class Node {
  int data;
  Node left_child;
  Node right_child;

  Node(int data){
    this.data = data;
    this.left_child = null;
    this.right_child = null;
  }
}
//Root node of the tree
  