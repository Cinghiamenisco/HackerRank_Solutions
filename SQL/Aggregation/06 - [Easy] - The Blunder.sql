-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

select ceil((avg(salary) - avg(TO_NUMBER(REPLACE(TO_CHAR(Salary),'0','')))))
from employees
;
