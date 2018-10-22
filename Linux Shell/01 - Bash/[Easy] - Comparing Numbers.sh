# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

read x
read y
if [ $x -lt $y ]; then
    echo "X is less than Y";
elif [ $x -eq $y ]; then
    echo "X is equal to Y";
else
    echo "X is greater than Y";
fi
