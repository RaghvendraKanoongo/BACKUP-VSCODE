--  table 1
use bank;
CREATE TABLE customer (

  customer_name TEXT ,
  street varcharacter(30),
  city varcharacter (30)
);

INSERT INTO customer VALUES ('Amit', 'M.G.Road', 'Indore');
INSERT INTO customer VALUES ('Arpit', 'Bus Stand', 'Bhopal');
INSERT INTO customer VALUES ('Saurabh', ' Railway Station', 'Devas');
INSERT INTO customer VALUES ('Neema', 'Central Library', 'Rewa');
SELECT * FROM customer;