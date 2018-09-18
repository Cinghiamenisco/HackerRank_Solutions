// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
    //Inorder (Left, Root, Right)
    public static void inOrder(Node root) {
        
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        return;
        
    }
