// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
        Stack<Character> stack = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
        
        boolean res;
        
		while (sc.hasNext()) {
			String input=sc.next();
            
            stack.removeAllElements();
            res = true;
            
            for (int i=0; i<input.length(); i++) {
                                
                switch(input.charAt(i)) {
                    case '(':
                        stack.push(input.charAt(i));
                        break;
                    case '[':
                        stack.push(input.charAt(i));
                        break;
                    case '{':
                        stack.push(input.charAt(i));
                        break;    
                    case ')':
                        if( ! (stack.pop()).equals('(') )
                            res = false;
                        break;
                    case ']':
                        if( ! (stack.pop()).equals('[') )
                            res = false;
                        break;
                    case '}':
                        if( ! (stack.pop()).equals('{') )
                            res = false;
                        break;    
                }
            }
            if (! stack.isEmpty()) {
                res = false;
            }
            System.out.println(res);
        }
            
	}
}



