-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT  cc.company_code
        ,MAX(cc.founder)
        ,count(distinct(lm.lead_manager_code))
        ,count(distinct(sm.senior_manager_code))
        ,count(distinct(mg.manager_code))                        
        ,count(distinct(em.employee_code))                        
FROM    company cc
        ,lead_manager lm
        ,senior_manager sm
        ,manager mg
        ,employee em
WHERE   1=1
-- Joins
AND     cc.company_code = lm.company_code
AND     lm.company_code = sm.company_code
AND     sm.company_code = mg.company_code
AND     mg.company_code = em.company_code
GROUP BY    cc.company_code                        
;
