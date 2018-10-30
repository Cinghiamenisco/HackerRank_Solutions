# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

awk '{
    res = ($2+$3+$4)/3
    if (res < 50) {
        print $0,": FAIL"
    } else if (res < 60) {
        print $0,":","C"
    } else if (res < 80) {
        print $0,":","B"
    } else {
        print $0,":","A"
    }
}'
