// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, *arr, i;
    scanf("%d", &num);
    arr = (int*) malloc(num * sizeof(int));
    for(i = 0; i < num; i++) {
        scanf("%d", arr + i);
    }


    /* Write the logic to reverse the array. */
    int *newArr;
    int k=0;
    newArr = (int*) malloc(num * sizeof(int));
    for (int i=0; i<num; i++) {
        k = num-1-i;
        newArr[i] = arr[k];
    }
    
    arr = newArr;  
    
    for(i = 0; i < num; i++)
        printf("%d ", *(arr + i));
    return 0;
}
