/* https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/ */

/* Write your MySQL query statement below */
select EmployeeUNI.unique_id,Employees.name 
from Employees 
left join EmployeeUNI 
on EmployeeUNI.id=Employees.id;