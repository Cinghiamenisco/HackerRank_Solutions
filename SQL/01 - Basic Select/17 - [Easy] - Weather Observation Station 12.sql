-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select distinct(s.city)
from station s
where 1=1
and UPPER(s.city) not like 'A%'
and UPPER(s.city) not like 'E%'
and UPPER(s.city) not like 'I%'
and UPPER(s.city) not like 'O%'
and UPPER(s.city) not like 'U%'
and UPPER(s.city) not like '%A'
and UPPER(s.city) not like '%E'
and UPPER(s.city) not like '%I'
and UPPER(s.city) not like '%O'
and UPPER(s.city) not like '%U'
;
