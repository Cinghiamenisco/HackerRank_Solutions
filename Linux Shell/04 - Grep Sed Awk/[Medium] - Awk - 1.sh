# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#NF = Number of fields
#NR = number of records

awk '{
    if ( NF < 4 )
        { print "Not all scores are available for", $1 }
}'
