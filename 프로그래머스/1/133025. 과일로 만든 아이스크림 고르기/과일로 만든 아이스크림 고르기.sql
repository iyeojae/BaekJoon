SELECT a.FLAVOR
FROM FIRST_HALF AS a JOIN ICECREAM_INFO AS b
ON a.FLAVOR = b.FLAVOR
WHERE TOTAL_ORDER > 3000
AND INGREDIENT_TYPE = 'fruit_based'