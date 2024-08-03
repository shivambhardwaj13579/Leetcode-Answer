/* https://leetcode.com/problems/rising-temperature/description/ */

/* Write your MySQL query statement below */
SELECT w2.id
FROM Weather w1
join Weather w2
ON DATEDIFF (w1.recordDate ,w2.recordDate ) = -1
AND w2.temperature>w1.temperature