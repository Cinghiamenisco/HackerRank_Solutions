// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.util.*;

public class Solution {
    
    public static String getDay(String d, String m, String y) {

        int iy = Integer.parseInt(y);
        int im = Integer.parseInt(m)-1;
        int id = Integer.parseInt(d);
        
        Calendar calendar = new GregorianCalendar(iy,im,id);
        
        switch(calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1: return "SUNDAY";
            case 2: return "MONDAY";
            case 3: return "TUESDAY";
            case 4: return "WEDNESDAY";
            case 5: return "THURSDAY";
            case 6: return "FRIDAY";
            case 7: return "SATURDAY";
        }
        return "ERROR";
    }
...
