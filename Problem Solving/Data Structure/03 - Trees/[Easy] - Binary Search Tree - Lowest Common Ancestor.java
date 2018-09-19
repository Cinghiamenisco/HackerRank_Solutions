// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
        if (root == null) {
           return null;
       }

   // If the root is one of a or b, then it is the LCA
       if (root.data == v1 || root.data == v2) {
           return root;
       }

       Node left = lca(root.left, v1, v2);
       Node right = lca(root.right, v1, v2);

       // If both nodes lie in left or right then their LCA is in left or right,
       // Otherwise root is their LCA
       if (left != null && right != null) {
          return root;
       }

       return (left != null) ? left : right; 
        
    }
