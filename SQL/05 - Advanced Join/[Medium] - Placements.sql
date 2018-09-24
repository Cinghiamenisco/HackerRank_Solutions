-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT      s.name
FROM        students    s
INNER JOIN  packages    p   ON  p.ID = s.ID
INNER JOIN  friends     f   ON  f.ID = s.ID
INNER JOIN  packages    p2  ON  p2.ID = f.friend_ID
WHERE       1=1
AND         p2.Salary > p.Salary
ORDER BY    p2.Salary ASC
;
