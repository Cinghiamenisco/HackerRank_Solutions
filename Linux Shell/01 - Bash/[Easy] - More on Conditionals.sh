# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

read a
read b
read c

if [ $a -eq $b ] && [ $a -eq $c ]; then
    echo "EQUILATERAL"
elif [ $a -eq $b ] || [ $a -eq $c ] || [ $b -eq $c ]; then
    echo "ISOSCELES"
else
    echo "SCALENE"
fi
