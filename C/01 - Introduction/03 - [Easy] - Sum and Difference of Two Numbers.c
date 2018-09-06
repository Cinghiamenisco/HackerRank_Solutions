// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int a, b;
    float x, z;
    
    scanf("%d %d\n",&a, &b);
    scanf("%f %f\n",&x, &z);
    
    printf("%d %d\n", (a+b), (a-b));
    printf("%0.1f %0.1f\n", (x+z), (x-z));
    
    return 0;
}
