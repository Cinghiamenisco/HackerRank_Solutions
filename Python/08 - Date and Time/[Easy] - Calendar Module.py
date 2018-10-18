# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#Who cares about calendar. I like datetime more

import datetime

inp = input().split()
#MM DD YYYY
target_day = datetime.date(int(inp[2]),int(inp[0]),int(inp[1]))
print(target_day.strftime('%A').upper())
