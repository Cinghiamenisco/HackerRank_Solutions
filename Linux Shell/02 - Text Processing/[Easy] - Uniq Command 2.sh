# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

uniq -c $1 | tr -s ' ' ' ' | cut -f2- -d ' '
