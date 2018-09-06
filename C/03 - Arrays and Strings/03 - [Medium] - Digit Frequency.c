// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s = (int*)malloc(1000*sizeof(char));    
    int numeri[10] = {0};
    
    scanf("%s", s);
    
    // ASCII to INT -48
    for(int i=0; i<strlen(s); i++) {
        if (( (s[i] -48) >= 0) && ( (s[i] -48) <= 9)) {
            numeri[s[i]-48]++;   
        }
    }
    
    for(int i=0; i<10; i++) {
        printf("%d ", numeri[i]);    
    }
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
