// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    //Write your logic to print the tokens of the sentence here.
    
    int i=0;
    while (i < strlen(s)) {
        if (*(s+i) == ' ') {
            printf("\n");
        } else {
            printf("%c",*(s+i));
        }        
        i++;
    }
    
    
    //printf("%s",s);
    
    return 0;
}
