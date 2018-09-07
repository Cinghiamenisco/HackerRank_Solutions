// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

int  sum (int count,...) {

  va_list ap;
  int i, sum;

  va_start (ap, count);         /* Initialize the argument list. */

  sum = 0;
  for (i = 0; i < count; i++)
    sum += va_arg (ap, int);    /* Get the next argument value. */

  va_end (ap);                  /* Clean up. */
  return sum;
    
}

int min(int count,...) {
    va_list ap;
    int i, min;
    
    va_start(ap, count);
    min = va_arg(ap, int);
    
    for (i=0; i<count-1; i++) {
        int temp = va_arg(ap, int);
        if (temp < min) {
            min = temp;
        }
    }
    
    va_end(ap);
    
    return min;
}

int max(int count,...) {
    
    va_list ap;
    int i, max;
    
    va_start(ap, count);
    max = va_arg(ap, int);
    
    for (i=0; i<count-1; i++) {
        int temp = va_arg(ap, int);
        if (temp > max) {
            max = temp;
        }
    }
    
    va_end(ap);
    
    return max;    
}
