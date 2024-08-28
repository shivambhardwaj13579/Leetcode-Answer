/* https://leetcode.com/problems/tree-node/ */

/* Write your MySQL query statement below */
select id ,
    case 
    when P_id is null then 'Root'
    when p_id = any(select id from tree) and id = any(select p_id from tree) then 'Inner'
    else 'Leaf'
    end
    as type
from tree 