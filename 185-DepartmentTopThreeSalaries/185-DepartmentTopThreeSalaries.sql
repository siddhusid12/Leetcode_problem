-- Last updated: 9/3/2025, 10:08:28 AM
# Write your MySQL query statement below
SELECT d.name AS Department,
e.name AS Employee,
e.salary AS Salary
 FROM Employee e JOIN Department d ON e.departmentId = d.id
 where(select COUNT(DISTINCT e2.salary) FROM Employee e2
 WHERE e2.departmentId = e.departmentId AND
 e2.salary > e.salary) <3;
