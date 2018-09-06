// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    
    int sum = 0;
    
    while (n>9) {
        sum += (n%10);
        n = n/10;
    }
    sum += n;
    
    printf("%d",sum);
    
    return 0;
}
