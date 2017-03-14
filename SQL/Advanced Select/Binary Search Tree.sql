SELECT N,
    CASE 
        WHEN (p is null) THEN 'Root' 
        WHEN (n = any(select p from bst)) THEN 'Inner'
        ELSE 'Leaf'
    END CASE 
FROM bst
ORDER BY N;