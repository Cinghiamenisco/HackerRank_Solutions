// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        if (root == null) {
            return -1;
        }
        int l = height(root.left);
        int r = height(root.right);
        return 1 + java.lang.Math.max(l,r);
    }
