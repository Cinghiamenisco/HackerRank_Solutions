// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. 
Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/

    Integer checkMIN(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        
        Integer min = Math.min(checkMIN(root.right),checkMIN(root.left));
        return Math.min(min,root.data);
    }

    Integer checkMAX(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        
        Integer max = Math.max(checkMAX(root.right),checkMAX(root.left));
        return Math.max(max,root.data);
    }

    boolean checkBST(Node root) {
        
        if (root == null) {
            return true;
        }        
        //Controllo i due sottoalberi del nodo
        if (checkMAX(root.left) >= root.data || checkMIN(root.right) <= root.data) {
            return false;
        }
        //Controllo che i valori siano nell'ordine giusto
        if (root.left != null && root.left.data >= root.data) {
            return false;
        }
        if (root.right != null && root.right.data <= root.data) {
            return false;
        }        
        
        return (checkBST(root.left) && checkBST(root.right));
        
    }
