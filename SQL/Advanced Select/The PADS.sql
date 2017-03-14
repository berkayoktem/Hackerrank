select concat(Name, concat('(', concat(substr(Occupation,0,1),')'))) as new 
from occupations 
order by new;

select concat('There are total ', concat(count(Occupation), concat(' ',concat(lower(Occupation),'s.')))) as new 
from occupations 
group by occupation 
order by count(occupation),occupation;