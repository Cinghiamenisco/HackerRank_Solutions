// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);

    int editColonna;
    int editRiga;
    
    for(int riga = 0; riga < (2*n)-1; riga++) {
        for( int colonna = 0; colonna < (2*n)-1; colonna++) {
            
            editColonna = abs(colonna-(n-1));
            editRiga = abs(riga-(n-1));
            
            printf("%d ", (editColonna > editRiga) ? editColonna + 1 : editRiga + 1);
        }
        printf("\n");
    }
    return 0;
}
