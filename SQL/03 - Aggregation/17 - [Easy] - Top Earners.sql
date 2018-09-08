-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select  max(oe.months * oe.salary)
        ,count(oe.employee_id)
from employee oe
where (oe.months * oe.salary) = (
                                select max(e.months * e.salary)
                                from employee e
                              )
;
