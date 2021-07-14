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

--4.Soru
SELECT first_name, last_name, count FROM customer
INNER JOIN (SELECT customer_id, COUNT(*) FROM payment GROUP BY customer_id) secondJoin ON customer.customer_id = secondJoin.customer_id
