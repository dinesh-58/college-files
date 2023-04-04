use HCOE2077
select id, name from student
select name, faculty from teacher

-- 5: 
alter table student drop column rn
-- 6: 
alter table teacher add salary int
-- 7:
select id, name into info_student from student 
select * from info_student