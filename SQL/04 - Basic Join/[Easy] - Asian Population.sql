-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT sum(ci.population)
from country co, city ci
WHERE co.code = ci.countrycode
and co.continent = 'Asia'
;
