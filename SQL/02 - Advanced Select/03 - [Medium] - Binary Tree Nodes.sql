-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

SELECT T.N, 
        case when T.P is null then 'Root' 
             when T.N IN (select tINNER.P from bst tINNER where tINNER.p is not null) then 'Inner'
             else 'Leaf'
             end
from bst T
order by t.N asc
;
