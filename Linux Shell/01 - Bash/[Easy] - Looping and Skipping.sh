# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

for i in {1..99}
do
    if [ $(( i%2 )) -eq 0 ]; then
        continue
    fi
    echo $i
done
