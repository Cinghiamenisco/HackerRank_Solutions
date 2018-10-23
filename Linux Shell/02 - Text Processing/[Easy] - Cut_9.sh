# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

DONE=false
until $DONE ; do
    read || DONE=true
    cut -f2- <<< "$REPLY"
done
