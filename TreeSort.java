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
  private Node head; // Points to the head of the linked list

  // constructor to initialize the linked list
  public SinglyLinkedList() {
    this.head = null;
  }

  //Method to add children to the tree

  public void addChild(int data) {
    Node newNode = new Node(data);

    //if the list is empty, make the new node the head

    if (head == null) {
      head = newNode;
      return;

    for (i = 0; i < data.length; i++){
      array1[i] = head
    }
    }
  }
        String temp = array1[i];
        array1[i] = array1[i/2];
        array1[i/2] = temp;
        i = i/2;
    }


  