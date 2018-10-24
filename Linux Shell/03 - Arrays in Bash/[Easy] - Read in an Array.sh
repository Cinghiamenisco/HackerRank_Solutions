# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

i=0
while read line
do
    array[$i]=$line
    let i++
done

#Metodo Semplice
#echo ${array[@]}

#   Lunghezza di un array:
#   ${#array[@]}

while [ $i -gt 0 ] ;
do
    echo -n ${array[${#array[@]}-i]} ; echo -n " "
    let i--
done
