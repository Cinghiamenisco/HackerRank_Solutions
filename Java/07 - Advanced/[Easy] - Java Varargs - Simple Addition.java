// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco


class Add {

    static void add(int... numbers) {
    int tot = 0;
    int i=1;
        for(int number : numbers) {
            tot+=number;
            System.out.print(number + (i++<numbers.length ? "+" : "="));
        }
        System.out.println(tot);
    }

}
