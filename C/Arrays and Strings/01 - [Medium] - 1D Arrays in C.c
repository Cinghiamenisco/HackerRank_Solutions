// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int len;
    scanf("%d", &len);
    
    int array[len];
    int sum = 0;
    
    for (int i=0; i<len; i++) {
        scanf("%d",&array[i]);
        sum += array[i];
    }
    
    printf("%d", sum);
    
    return 0;
}
