/* https://leetcode.com/problems/duplicate-emails/ */

/* Write your MySQL query statement below */
select email
from person
group by email
having count(email)>1