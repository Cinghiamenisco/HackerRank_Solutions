// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

//Complete the following function.

void calculate_the_maximum(int n, int k) {
  //Write your code here.
    
    int maxAND = 0;
    int maxOR = 0;
    int maxXOR = 0;
    
    for (int i=1; i<n; i++) {
        for (int j=i+1; j<=n; j++) {
            //a > b
            int bitAND = i&j;
            int bitOR = i|j;
            int bitXOR = i^j;
            
            if ((bitAND > maxAND) && (bitAND < k))
                maxAND = bitAND;
            
            if ((bitOR > maxOR) && (bitOR < k))
                maxOR = bitOR;
            
            if ((bitXOR > maxXOR) && (bitXOR < k))
                maxXOR = bitXOR; 


        }
    }
    
    printf("%d \n", maxAND);
    printf("%d \n", maxOR);
    printf("%d \n", maxXOR);
    
    
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
