# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

i=0
for line in `cat $1`;
do
   array[$i]=$line
   let i++
done

array=("${array[@]}" "${array[@]}" "${array[@]}")

echo ${array[@]}
