CREATE TABLE borrow(
    customer_name TEXT,
    branch_name TEXT,
    loan_no INTEGER,
    ammount INTEGER
);
INSERT INTO borrow VALUES ('Amit', 'Mahesh Nagar', 401, 1000);
INSERT INTO borrow VALUES ('Arpit', 'Raj Mohalla', 402, 2500);
INSERT INTO borrow VALUES ('Saurabh', 'Rajwada', 403, 3500);
INSERT INTO borrow VALUES ('Neema', 'Gandhi Nagar', 404, 4500);

SELECT * FROM borrow;