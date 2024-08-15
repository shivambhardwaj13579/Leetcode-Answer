/* https://leetcode.com/problems/second-highest-salary/ */

/* Write your MySQL query statement below */
select max(salary) as SecondHighestSalary
from Employee
WHERE salary < (SELECT MAX(salary) FROM Employee)