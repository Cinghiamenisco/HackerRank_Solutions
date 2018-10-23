# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

DONE=false
until $DONE ; do
    read || DONE=true
    echo $REPLY | cut -c2-7
done
