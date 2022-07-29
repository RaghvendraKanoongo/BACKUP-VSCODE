CREATE TABLE deposite(
    customer_name TEXT,
    branch_name TEXT,
    acc_no INTEGER,
    balance INTEGER
);
INSERT INTO deposite VALUES ('Amit', 'Mahesh Nagar', 101, 1000);
INSERT INTO deposite VALUES ('Arpit', 'Raj Mohalla', 102, 2000);
INSERT INTO deposite VALUES ('Saurabh', 'Rajwada', 103, 3000);
INSERT INTO deposite VALUES ('Neema', 'Gandhi Nagar', 104, 3000);

SELECT * FROM deposite;