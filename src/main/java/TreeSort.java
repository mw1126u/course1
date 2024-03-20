public class TreeSort {

//Node class representing each element in the linked list
  static class Node {
      int data;
      Node left_child;
      Node right_child;
      Node(int data) {
          this.data = data;
          left_child = null;
          right_child = null;
      }
  }
//Root node of the tree
  Node head; // Points to the head of the linked list

  //Method to add children to the tree

  public void addChild(int data) {
    Node newNode = new Node(data);

    //if the list is empty, make the new node the head

    if (head == null) {
      head = newNode;
    } else {
      Node current = head;

    while(true){
      // check if new nod should go left or right
      if (data < current.data){
        if (current.left_child == null){
          current.left_child = newNode;
          return;
        }
        current = current.left_child;
          
        }
        else {
          if (current.right_child == null){
            current.right_child = newNode;
            return;
          }
          current = current.right_child;
          }
        }
      }
    }
 

  public void inOrderTraversal(Node current){
    if (current != null){
      inOrderTraversal(current.left_child);
      System.out.println(current.data);
      inOrderTraversal(current.right_child);
    }
  }
}


  