// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.util.*;
import java.io.*;

class Solution{
    
	public static void main(String []argh)
	{
        HashMap<String,Integer> rubrica = new HashMap<String,Integer>();
        
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            rubrica.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            Integer numero = rubrica.get(s);
            if (numero != null) {
                System.out.println(s + "=" + numero);
            } else {
                System.out.println("Not found");
            }
		}
	}
}


