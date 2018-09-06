-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select distinct s.city
from    station s
where 1=1
and     (upper(s.city) like 'A%'
        OR
        upper(s.city) like 'E%'
        OR
        upper(s.city) like 'I%'
        OR
        upper(s.city) like 'O%'
        OR
        upper(s.city) like 'U%'
        )
and     (upper(s.city) like '%A'
        OR
        upper(s.city) like '%E'
        OR
        upper(s.city) like '%I'
        OR
        upper(s.city) like '%O'
        OR
        upper(s.city) like '%U'
        )
;
