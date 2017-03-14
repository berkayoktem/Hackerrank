select round(long_w, 4)
from station
where round(lat_n, 4) = (select round(max(lat_n),4) from station where lat_n < 137.2345 );
