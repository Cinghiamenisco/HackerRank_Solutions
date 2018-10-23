# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

read n
sum=0
count=0
tot=$n
while [ "$n" -gt 0 ]
do
    let n--
    let count++
    read val
    let sum=sum+val
done
answer=$(bc <<< "scale=4;$sum/$count")
printf %.3f $answer

#echo $answer
#Con scale=3 e senza printf, ci sono problemi di arrotondamento.
