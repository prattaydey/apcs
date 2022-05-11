// Team Mamba: Nafiz Labib, Kartik Vanjani, Prattay Dey
// APCS pd8
// HW96 -- BSTs is the Perfect Place for Shade
// 2022-05-10t
// time spent: 0.7 hrs

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    if (_root == null){ _root = newNode; }
    else {
      insert(_root, newNode);
    }
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( stRoot.getValue() < newNode.getValue() ){ // if newNode has value greater than current
      if (stRoot.getRight() == null) { stRoot.setRight(newNode); } // if no right child, put newNode here
      else {
        insert(stRoot.getRight(), newNode); // else recurse down right subtree until node with no right child is reached, then insert
      }
    }
    else { //if newNode has value less than current
      if ( stRoot.getLeft() == null) { stRoot.setLeft(newNode); } // if no left child, put newNode here
      else{
        insert(stRoot.getLeft(), newNode); // else recurse down left subtree
      }
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }

  public void preOrderTrav( TreeNode currNode )
  {
    System.out.println( currNode.getValue() );
    if ( currNode.getLeft() != null) { preOrderTrav( currNode.getLeft() ); }
    if ( currNode.getRight() != null) { preOrderTrav( currNode.getRight() ); }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() == null && currNode.getRight() != null){
      inOrderTrav(currNode.getRight());
      System.out.println(currNode.getValue());
      return;
    }

    if (currNode.getLeft() != null){ inOrderTrav(currNode.getLeft()); }
    System.out.println(currNode.getValue());
    if (currNode.getRight() != null){ inOrderTrav(currNode.getRight()); }
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null){ postOrderTrav(currNode.getLeft()); }
    if (currNode.getRight() != null){ postOrderTrav(currNode.getRight()); }
    System.out.println(currNode.getValue());
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /*****************************************************
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   *****************************************************/
  TreeNode search( int target )
  {
    TreeNode tmp = _root;
    while ( tmp != null){
      if (tmp.getValue() == target){ return tmp; }
      else if (tmp.getValue() > target ){
        tmp = tmp.getLeft();
      }
      else {
        tmp = tmp.getRight();
      }
    }
    return null;
  }


  /*****************************************************
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 1
   *****************************************************/
  public int height()
  {
    return heightHelper(_root);
  }

  public int heightHelper(TreeNode currNode)
  {
    if (currNode.getLeft() == null && currNode.getRight() == null){ return 0; } // base case
    if (currNode.getLeft() != null && currNode.getRight() == null){ // if only left subtree exists, count down left
      return 1 + heightHelper( currNode.getLeft() );
    }
    if (currNode.getLeft() == null && currNode.getRight() != null){ // if only right subtree exists, count down right
      return 1 + heightHelper( currNode.getRight() );
    }
    if (currNode.getLeft() != null && currNode.getRight() != null){ // if both left and right subtrees exist, find the greater value and count down that path
      if (heightHelper( currNode.getLeft() ) > heightHelper( currNode.getRight() )){
        return 1 + heightHelper( currNode.getLeft() );
      }
      else{
        return 1 + heightHelper( currNode.getRight() );
      }
    }
    return 0;
  }


  /*****************************************************
   * int numLeaves()
   * returns number of leaves in tree
   *****************************************************/
  public int numLeaves()
  {
    return numLeavesHelper(_root);
  }

  public int numLeavesHelper(TreeNode currNode)
  {
    if (currNode.getLeft() == null && currNode.getRight() == null){ return 1; } // base case is a leaf
    if (currNode.getLeft() != null && currNode.getRight() == null){ // if only left subtree exists, go down left
      return numLeavesHelper( currNode.getLeft() );
    }
    if (currNode.getLeft() == null && currNode.getRight() != null){ // if only right subtree exists, go down right
      return numLeavesHelper( currNode.getRight() );
    }
    else { // if (currNode.getLeft() != null && currNode.getRight() != null)
      return numLeavesHelper( currNode.getLeft() ) + numLeavesHelper( currNode.getRight() );
    }
  }


  //main method for testing
  public static void main( String[] args )
  {

      BST arbol = new BST();

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );

    /*
      4        4       4         4               4                 4
             /       /  \      /  \            /  \              /  \        *SKETCHED TREES*
           2       2     5    2    5          2    5           2     5
                                    \       /      \         /  \     \
                                     6     1        6       1   3      6
    */

      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "height:" );
      System.out.println( arbol.height() );

      System.out.println( "\n-----------------------------");
      System.out.println( "# of leafs:" );
      System.out.println( arbol.numLeaves() );
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
