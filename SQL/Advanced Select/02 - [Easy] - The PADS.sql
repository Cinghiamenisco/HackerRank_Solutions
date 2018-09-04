-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select o.name || '(' || SUBSTR(o.occupation,1,1) || ')'
from occupations o
order by o.name || '(' || SUBSTR(o.occupation,1,1) || ')' ASC
;

select 'There are a total of ' || count(o.occupation) || ' ' || LOWER(o.occupation) || 's.'
from occupations o
group by o.occupation
order by count(o.occupation) ASC, o.occupation ASC
;
