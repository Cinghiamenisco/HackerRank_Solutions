# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

DONE=false
until $DONE ; do
    read || DONE=true
    #Modifica necessaria. Echo sembra trasformare i TAB in Spazi
    cut -f1-3 <<< "$REPLY"
done
