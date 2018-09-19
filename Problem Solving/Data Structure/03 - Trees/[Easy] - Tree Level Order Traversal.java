// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

	/* 
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

    //Coda
    public static Queue<Node> queue = new LinkedList<Node>();
    
    //Effettuo una BFS
    public static void levelOrder(Node root) {
        
        queue.add(root);
        
        while (!(queue.isEmpty())) {
            Node tmp = queue.poll();
            System.out.print(tmp.data + " ");
            if (tmp.left != null)
                queue.add(tmp.left);
            if (tmp.right != null)
                queue.add(tmp.right);
        }
    }
