// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

        HashSet<String> ins = new HashSet<String>();

        for (int i=0; i<t; i++) {
            
            ins.add(pair_left[i] + " " + pair_right[i]);
            
            System.out.println(ins.size());
        }        
