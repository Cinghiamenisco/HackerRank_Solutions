# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

i=0
while read line
do
    array[$i]=$line
    let i++
done

declare -a newarray=( ${array[@]/*[aA]*} )

echo ${newarray[@]}
