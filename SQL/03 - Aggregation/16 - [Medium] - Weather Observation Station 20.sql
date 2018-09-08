-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

/* EASY WAY
select  round(median(so.lat_n),4)
from station so
;
*/

select round(avg("lat"),4)
from (
    select lat_n as "lat"
    ,(row_number() OVER (ORDER BY lat_n)) as "num"
    from station outs
    where 1=1
    ) risultati
    ,(
    select count(ID) as "tot"
    from station
    )
where 1=1
--workaround set pari/dispari
and "num" >= ceil("tot"/2)
and "num" <= ceil(("tot"+1)/2)
;
