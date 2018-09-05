// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

int main()
{
    int total_number_of_shelves;
    scanf("%d", &total_number_of_shelves);
    
    int total_number_of_queries;
    scanf("%d", &total_number_of_queries);
    
    int rows = total_number_of_shelves;
    int cols = 1;
    
    //I'm allocating a small matrix, where rows are shelves...
    total_number_of_pages = (int**)malloc(rows * cols * sizeof(int*));
    //...and every shelves has only a single spot for a book. For now.
    for (int i=0; i<cols; i++) {
        total_number_of_pages[i] = (int*)malloc(cols * sizeof(int*));
    }
    
    //I'm allocating an array, as long as the number of shelves. 
    //Every cell N of the array contains an int that tells me how many book are in the N-th shelf
    total_number_of_books = (int*)malloc(rows * sizeof(int));
    
    while (total_number_of_queries--) {
        int type_of_query;
        scanf("%d", &type_of_query);
        
        if (type_of_query == 1) {
            
            int x, y;
            scanf("%d %d", &x, &y);
            
            //Reading how many books are in the X-th shelf
            int cols_x = total_number_of_books[x];
                        
            //Resizing the X-th shelf to hold 1 book more
            total_number_of_pages[x] = (int*)realloc(*(total_number_of_pages + x), (cols_x + 1) * sizeof(int*));
                        
            //Updating the number of books in the X-th shelf
            total_number_of_books[x]++;
            
            //Putting the int Y, in the X-th shelf, at cols_x position.
            total_number_of_pages[x][cols_x] = y;
            
