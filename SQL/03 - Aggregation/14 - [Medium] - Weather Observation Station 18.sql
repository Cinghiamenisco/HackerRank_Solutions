-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/

select  round(abs(min(s.lat_n) - max(s.lat_n)) + abs(min(s.long_w) - max(s.long_w)),4)
-- Manhattan DIstance: In a plane with p1 at (x1, y1) and p2 at (x2, y2), it is |x1 - x2| + |y1 - y2|.
from station s
;
