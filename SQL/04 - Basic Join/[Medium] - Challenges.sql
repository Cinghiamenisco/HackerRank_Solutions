-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

WITH SOL(id, name, creat, prec, postc) as 
    (
    select  h.hacker_id
    ,h.name
    ,count(c.challenge_id) as creat
    ,lag(count(c.challenge_id), 1, 0) over (order by count(c.challenge_id)) as prec
    ,lead(count(c.challenge_id), 1, 0) over (order by count(c.challenge_id)) as postc
    from hackers h
    inner join challenges c on (h.hacker_id = c.hacker_id)
    group by h.hacker_id, h.name
    )
SELECT id, name, creat
FROM SOL
WHERE   1=1
AND     (prec != creat
         AND
         postc != creat
         )
OR      creat = 50 
ORDER BY creat DESC, id ASC                                             
;
