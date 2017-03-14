select to_char(sqrt(power((min(long_w)-min(lat_n)), 2) + power((max(long_w)-max(lat_n)), 2)), '99.9999')
from station;