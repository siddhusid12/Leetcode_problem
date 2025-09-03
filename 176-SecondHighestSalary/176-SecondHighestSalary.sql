-- Last updated: 9/3/2025, 10:08:30 AM
# Write your MySQL query statement below
select ( select distinct salary from Employee order by salary DESC
limit 1 offset 1) as SecondHighestSalary;