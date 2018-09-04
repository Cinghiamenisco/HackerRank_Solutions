-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select case WHEN A + B <= C OR B + C <= A OR A + C <= B THEN 'Not A Triangle'
            WHEN A = B AND B = C Then 'Equilateral'
            WHEN A = B OR B = C OR A = C Then 'Isosceles'
            WHEN A != B OR B != C OR A != C Then 'Scalene'
            END
from TRIANGLES t
;
