-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT  sum(c.population)
FROM    city c
WHERE   LOWER(c.district) = 'california'
;
