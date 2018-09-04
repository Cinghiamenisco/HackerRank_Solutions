-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select  s.name
from students s
where 1=1
and     s.marks > 75
ORDER BY SUBSTR(s.name,-3) asc, s.id asc
;
