/* https://leetcode.com/problems/customers-who-never-order/ */

/* Write your MySQL query statement below */
select name as Customers
from customers
left join orders
on customers.id = orders.customerID
where orders.id is null