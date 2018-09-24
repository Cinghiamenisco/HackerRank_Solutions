-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT      "HID"
            ,"NAME"
            ,SUM("SSCORE")
FROM        (
            SELECT      h.name                  as "NAME"
                        ,h.hacker_id            as "HID"
                        --,s.submission_id
                        ,s.challenge_id         as "CID"
                        ,max(s.score)           as "SSCORE"
            FROM        hackers h
            INNER JOIN  submissions s
                ON s.hacker_id = h.hacker_id
            WHERE       1=1
            AND         s.score > 0
            GROUP BY    h.name
                        ,h.hacker_id
                        ,s.challenge_id
)
WHERE       1=1
GROUP BY    "HID"
            ,"NAME"
ORDER BY    SUM("SSCORE") DESC
            ,"HID" ASC
;
