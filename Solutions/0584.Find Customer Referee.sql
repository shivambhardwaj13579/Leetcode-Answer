/* https://leetcode.com/problems/find-customer-referee/?envType=study-plan-v2&envId=top-sql-50 */

/* Write your MySQL query statement below */
select name from customer
where referee_id is null or referee_id <> 2
