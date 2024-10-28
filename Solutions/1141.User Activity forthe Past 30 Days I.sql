/* https://leetcode.com/problems/user-activity-for-the-past-30-days-i/ */

/* Write your MySQL query statement below */
select activity_date AS day , count(distinct user_id) as active_users
from activity 
where activity_date between "2019-06-28" and "2019-07-27"
group by activity_date