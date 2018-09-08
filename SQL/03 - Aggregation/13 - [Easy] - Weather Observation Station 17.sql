-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select round(s.long_w,4)
from station s
where s.lat_n = (select(min(inner.lat_n))
                       from station inner
                      where inner.lat_n > 38.7780
                )
;
