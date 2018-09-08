// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

int marks_summation(int* marks, int number_of_students, char gender) {
  //Write your code here.
    int bSum = 0;
    int gSum = 0;
    while (number_of_students--) {
        if (number_of_students % 2 == 0) {
            bSum += marks[number_of_students];
        } else {
            gSum += marks[number_of_students];
        }
    }
    return (gender == 'b') ? bSum : gSum;
}
