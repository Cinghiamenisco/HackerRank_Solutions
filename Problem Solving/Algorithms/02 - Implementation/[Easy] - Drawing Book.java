// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

static int pageCount(int n, int p) {

    //Se il numero totale di pagine è dispari, lo arrotondo al paro per difetto.
    if (n % 2 == 1) {
        n--;
    }

  //Se la pagina che cerco è dispari, la arrotondo al paro per difetto.
    if (p % 2 == 1) {
        p--;
    }

    if (p > (n/2)) {
        //Parto dalla fine
        return (n-p) / 2;
    } else {
        //Parto dall'inizio
        return p/2;
    }
    
    }
