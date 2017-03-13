select distinct(city) 
from station
where regexp_like(city, '^[^aeiou](\w|\s)*$', 'i') and regexp_like(city, '^(\w|\s)*[^aeiou]$', 'i')
order by city;