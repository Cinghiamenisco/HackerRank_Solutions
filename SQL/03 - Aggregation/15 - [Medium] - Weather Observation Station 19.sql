-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select TRUNC(SQRT(Power(max(lat_n) - min(lat_n),2) + Power(max(long_w) - min(long_w),2)),4)
from station
;
