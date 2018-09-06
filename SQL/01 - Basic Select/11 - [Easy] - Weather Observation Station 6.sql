-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT  DISTINCT(s.city)
FROM    station s
WHERE   1=1
AND     (LOWER(s.city) like 'a%'
        OR
         LOWER(s.city) like 'e%'
        OR
         LOWER(s.city) like 'i%'
        OR
         LOWER(s.city) like 'o%'
        OR
         LOWER(s.city) like 'u%'
         )        
;
