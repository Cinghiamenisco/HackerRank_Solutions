-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select TRUNC(sum(LAT_N),4)
from station
where lat_n > 38.7880
and lat_n < 137.2345
;
