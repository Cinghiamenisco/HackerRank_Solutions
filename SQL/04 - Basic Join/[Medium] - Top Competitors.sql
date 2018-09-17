-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT      h.hacker_id
            ,h.name
FROM        hackers     h
INNER JOIN  submissions s ON (s.hacker_id = h.hacker_id)
INNER JOIN  challenges  c ON (c.challenge_id = s.challenge_id)
INNER JOIN  difficulty  d ON (d.difficulty_level = c.difficulty_level)
WHERE       1=1
AND         d.score = s.score
GROUP BY    h.hacker_id
            ,h.name
HAVING      count(s.hacker_id) > 1
ORDER BY    count(s.hacker_id) DESC
            ,h.hacker_id ASC
;
