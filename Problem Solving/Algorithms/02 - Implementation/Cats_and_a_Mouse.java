// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

    static String catAndMouse(int x, int y, int z) {

        int sorcioA = x-z;
        int sorcioB = y-z;

        sorcioA = Math.abs(sorcioA);
        sorcioB = Math.abs(sorcioB);

        if (sorcioA == sorcioB) {
            return "Mouse C";
        } else if (sorcioA > sorcioB) {
            return "Cat B";
        } else {
            return "Cat A";
        }
        
    }
