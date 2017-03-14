SELECT 
    CASE 
        WHEN ((a+b) <= c OR (a+c) <= b OR (b+c) <= a)THEN 'Not A Triangle' 
        WHEN ((a+b) >= c OR (a+c) >= b OR (b+c) >= a) AND ((a = b AND b != c) OR (a = c AND a != b) OR (b=c AND a!=b)) THEN 'Isosceles' 
        WHEN ((a+b) >= c OR (a+c) >= b OR (b+c) >= a) AND a != b AND b != c AND c != a THEN 'Scalene' 
        WHEN a = b AND b = c THEN 'Equilateral' 
    END CASE 
FROM triangles;