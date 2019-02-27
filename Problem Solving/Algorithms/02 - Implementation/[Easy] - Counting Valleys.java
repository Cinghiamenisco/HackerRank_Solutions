// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

static int countingValleys(int n, String s) {

        int aboveOrUnderSeaLevel = 0;
        int amountOfValleys = 0;

        for (char c : s.toCharArray()) {

            if (c == 'U') {
                aboveOrUnderSeaLevel++;     
            } else {
                aboveOrUnderSeaLevel--;
            }

            if (aboveOrUnderSeaLevel == 0 && c == 'U') {
                amountOfValleys++;
            }

        }

    return amountOfValleys;

    }
