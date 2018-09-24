-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select c.name
from city c, country co
where 1=1
and c.Countrycode = Co.code
and co.continent = 'Africa'
;
