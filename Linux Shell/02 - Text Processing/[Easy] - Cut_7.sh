# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

DONE=false
until $DONE ; do
    read || DONE=true
    #Weird Behavior
    #Se non trova almeno 4 parole, stampa la prima?
    cut -f4 -d' ' <<< "$REPLY"
done
