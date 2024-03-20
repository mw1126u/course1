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
      Node parent = null;

    while(true){
      parent = current;
      // check if new nod should go left or right
      if (data < current.data){
        current = current.left_child;
        if (current == null){
          parent.left_child = newNode;
          return;
        }
        else {
          current = current.right_child;
          if (current == null){
            parent.right_child = newNode;
            return;
          }
        }
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


  