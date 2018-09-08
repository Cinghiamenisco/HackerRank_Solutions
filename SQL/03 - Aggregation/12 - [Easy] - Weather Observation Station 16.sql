-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select  round(min(s.lat_n),4)
from station s
where s.lat_n > 38.7780
;
