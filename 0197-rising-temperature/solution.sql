# Write your MySQL query statement below
select w2.id from Weather w2 join Weather w1 on w2.recordDate = date_add(w1.recordDate,interval 1 day) where w2.temperature > w1.temperature;
