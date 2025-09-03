-- Last updated: 9/3/2025, 10:08:10 AM
# Write your MySQL query statement below
select t.request_at AS Day, 
    round(sum(t.status != 'completed')/count(*), 2)as 'Cancellation Rate'
from Trips t inner join Users as Client  
on(t.client_id = Client.users_id)
inner join Users as Drivers  
on(t.driver_id = Drivers.users_id)
where Client.banned = 'No' and Drivers.banned = 'No' and
t.request_at between "2013-10-01" and "2013-10-03" group by 1