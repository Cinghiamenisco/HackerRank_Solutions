# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

i=0
for line in `cat $1`;
do
    arr[$i]=$line
    let i++
done

echo ${#arr[@]}
