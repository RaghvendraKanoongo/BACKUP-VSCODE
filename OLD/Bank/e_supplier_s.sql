 CREATE TABLE supplier(
    s varcharacter,
    s_name TEXT,
    s_status integer,
    city TEXT
);
INSERT INTO supplier VALUES ('s1', 'Mahesh', 20, 'Indore');
INSERT INTO supplier VALUES('s2', 'Deepak', 10, 'Bhopal');
INSERT INTO supplier VALUES('s3', 'Rajesh', 15, 'Rewa');
INSERT INTO supplier VALUES('s4', 'Dinesh', 30, 'Indore');
INSERT INTO supplier VALUES('s5', 'Rakesh', 40, 'Delhi');

SELECT * FROM supplier; 