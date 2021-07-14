SELECT COUNT(*) FROM film
WHERE length > 
(
	SELECT AVG(length) FROM film
);


SELECT COUNT(*) FROM film
WHERE rental_rate = 
(
	SELECT MAX(rental_rate) FROM film
);


SELECT * FROM film
WHERE rental_rate = 
(
	SELECT MIN(rental_rate) FROM film
)
UNION
SELECT * FROM film
WHERE replacement_cost = 
(
	SELECT MIN(replacement_cost) FROM film
);


SELECT customer_id, (SELECT COUNT(*) FROM payment WHERE customer_id = (SELECT DISTINCT customer_id FROM payment ))
FROM payment;
