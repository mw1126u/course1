
public class Main{

public static void main ( String[] args){
  

      //Create an instance of the TreeSort class and use it to create the Heap
      TreeSort treesort = new TreeSort();

      int[] array = {8,9,10,4,2,1,7,5,3,6};

      for (int i = 0; i < array.length; i++){
        treesort.addChild(array[i]);
      } 

      // Displaying the sorted arrays
     System.out.println(treesort.inOrderTraversal(treesort.head));
     
    }
  }
