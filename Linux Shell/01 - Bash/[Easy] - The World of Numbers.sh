# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

read x
read y
echo $((x + y))
echo `expr $x - $y`
echo $(( $x * $y ))
echo `expr $x / $y`

#Backtick, non apostrofi
