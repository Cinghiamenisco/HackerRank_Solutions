# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#My Solution Without AWK
#paste -s -d';\n' - -

awk '{
    if ( NR%2 == 0 )
        printf $0"\n";
    else
        printf $0";";
}'
