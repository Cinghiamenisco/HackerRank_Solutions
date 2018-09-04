// Christian.luzzetti@gmail.com

int main()
{
    int total_number_of_shelves;
    scanf("%d", &total_number_of_shelves);
    
    int total_number_of_queries;
    scanf("%d", &total_number_of_queries);
    
    int rows = 10000;
    int cols = 1000;
    
    total_number_of_pages = (int**)malloc(rows * cols * sizeof(int*));
    for(int i=0; i<cols; i++) {
        *(total_number_of_pages + i) = (int*)malloc(cols*sizeof(int*));
    }
    
    total_number_of_books = (int*)malloc(rows*sizeof(int));
    
    
    while (total_number_of_queries--) {
        int type_of_query;
        scanf("%d", &type_of_query);
        
        if (type_of_query == 1) {
            /*
             * Process the query of first type here.
             */
            int x, y;
            scanf("%d %d", &x, &y);  
            
            //y pages, at shelf number x
            
            int number_of_book_at_shelf_x = *(total_number_of_books + x);
            number_of_book_at_shelf_x++;
            *(total_number_of_books + x) = number_of_book_at_shelf_x;
            
            total_number_of_pages[x][number_of_book_at_shelf_x-1] = y;
            
            
            
            
