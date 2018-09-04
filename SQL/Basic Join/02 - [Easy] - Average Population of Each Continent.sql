-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select co.continent, floor(avg(c.population))
from country co, city c
where 1=1
and c.countrycode = co.code
group by co.continent
;
