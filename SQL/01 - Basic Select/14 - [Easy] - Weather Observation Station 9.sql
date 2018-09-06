-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select  distinct (s.city)
from station s
where 1=1
and (upper(s.city) not like 'A%')
and (upper(s.city) not like 'E%')
and (upper(s.city) not like 'I%')
and (upper(s.city) not like 'O%')
and (upper(s.city) not like 'U%')
;
