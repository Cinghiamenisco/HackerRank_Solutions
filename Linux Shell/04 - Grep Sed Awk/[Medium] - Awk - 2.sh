# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

awk '{
    if ( $2 > 50 && $3 > 50 && $4 > 50 ) {
        printf("%s : Pass\n", $1);
    } else {
        printf("%s : Fail\n", $1);
    }
}'

#Soluzione di qualcun'altro
#awk '{print $1,":", ($2<50||$3<50||$4<50) ? "Fail" : "Pass"}'
