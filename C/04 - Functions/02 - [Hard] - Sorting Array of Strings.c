// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco


int countDifferentChars(const char* str) {
    int charset[144] = {0};
    int diffChar = 0;
    
    for(int i=0; i<strlen(str);i++) {
        if (charset[str[i]] == 0) {
            charset[str[i]] = 1;
            diffChar++;
        }
    }
    return diffChar;
}

int lexicographic_sort(const char* a, const char* b) {
    return ((strcmp(a,b) > 0) ? 1 : 0);
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    return ((strcmp(a,b) > 0) ? 0 : 1);
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    if (countDifferentChars(a) == countDifferentChars(b)) {
        return ((strcmp(a,b) > 0) ? 1 : 0);
    }
    return (countDifferentChars(a) > countDifferentChars(b)) ? 1 : 0 ;
}

int sort_by_length(const char* a, const char* b) {
    return (strlen(a) < strlen(b)) ? 0 : 1 ;
}

void string_sort(char** arr,const int len,int (*cmp_func)(const char* a, const char* b)){
    for (int i=0; i<len; i++) {
        for(int k=i; k<len; k++ ) {
        //Lancio la funzione su arr[i] e arr[i+1]
            if (cmp_func(arr[i],arr[k]) == 1) {
                char * tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
            }
        }
    }
}
