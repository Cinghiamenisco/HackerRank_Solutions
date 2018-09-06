-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT  "citta", "lenCitta"
FROM    (select sINNER.city as "citta", LENGTH(sINNER.city) as "lenCitta"
         from  station sINNER
         order by LENGTH(sINNER.city) asc, sINNER.city asc )
WHERE   1=1
AND     ROWNUM = 1
;

SELECT  "citta", "lenCitta"
FROM    (select sINNER.city as "citta", LENGTH(sINNER.city) as "lenCitta"
         from  station sINNER
         order by LENGTH(sINNER.city) desc, sINNER.city asc )
WHERE   1=1
AND     ROWNUM = 1
;
