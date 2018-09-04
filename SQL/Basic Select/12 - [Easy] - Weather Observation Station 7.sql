-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT  DISTINCT(s.city)
FROM    station s
WHERE   1=1
AND     (UPPER(s.city) like '%A'
        OR
        UPPER(s.city) like '%E'
        OR
        UPPER(s.city) like '%I'
        OR
        UPPER(s.city) like '%O'
        OR
        UPPER(s.city) like '%U'
        )
;
