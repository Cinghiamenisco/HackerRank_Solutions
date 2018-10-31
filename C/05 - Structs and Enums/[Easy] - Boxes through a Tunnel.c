// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

struct box
{
    int length;
    int width;
    int height;
};

typedef struct box box;

int get_volume(box b) {
	return b.length * b.width * b.height;
}

int is_lower_than_max_height(box b) {
	return (b.height < MAX_HEIGHT) ? 1 : 0 ;
}
