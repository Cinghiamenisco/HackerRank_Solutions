# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

uniq -ci $s1 | tr -s ' ' ' ' | cut -f2- -d ' '
