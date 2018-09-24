-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT      f1.x, f1.y
FROM        functions f1
INNER JOIN  functions f2 ON f1.x = f2.y
WHERE       f1.y = f2.x
AND         f1.x <= f2.x
GROUP BY    f1.x, f1.y
HAVING      ((f1.x = f1.y AND sum(1) > 1)
            OR
            (f1.x != f1.y AND sum(1) = 1))
ORDER BY    f1.x
;
