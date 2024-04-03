/* https://leetcode.com/problems/recyclable-and-low-fat-products/?envType=study-plan-v2&envId=top-sql-50 */

SELECT Products.product_id 
FROM Products 
WHERE Products.low_fats = 'Y' AND Products.recyclable = 'Y';