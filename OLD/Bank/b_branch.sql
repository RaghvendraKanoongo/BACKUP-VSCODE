-- table 2 
CREATE TABLE branch (
	branch_name TEXT ,
  assets varcharacter,
  branch_city varcharacter
);

INSERT INTO branch VALUES ('Mahesh Nagar', 'M.G.Road', 'Indore');
INSERT INTO branch VALUES ('Raj Mohalla', 'Bus Stand', 'Bhopal');
INSERT INTO branch VALUES ('Rajwada', ' Railway Station', 'Devas');
INSERT INTO branch VALUES ('Gandhi Nagar', 'Central Library', 'Rewa');

-- fetch some values
SELECT * FROM branch;