// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

    public static int index = 0;

	void decode(String s, Node root) {
        while (index < s.length()) {
            pescaLettera(s, root);
        }   
    }

    void pescaLettera(String s, Node root) {
               
        if (root.left == null && root.right == null) {
            System.out.print(root.data);
            return;
        }
        
        if (s.charAt(index) == '1') {
            //destra
            index++;
            pescaLettera(s, root.right);
        } else {
            index++;
            pescaLettera(s, root.left);
        }
        
    }
