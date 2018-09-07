-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select round(long_w,4)
from station
where LAT_N = (
              select max(LAT_N) 
              from station 
              where lat_n < 137.2345
              )
;
