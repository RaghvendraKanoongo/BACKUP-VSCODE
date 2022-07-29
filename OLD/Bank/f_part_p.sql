CREATE TABLE part   (
    p TEXT,
    p_name TEXT,
    colour TEXT,
    weight INT,
    city TEXT
);
INSERT INTO part VALUES ('p1', 'Nut', 'red', 12, 'Indore');
INSERT INTO part VALUES ('p2', 'Bolt', 'green', 12, 'Bhopal');
INSERT INTO part VALUES ('p3', 'Screw', 'blue', 12, 'Rewa');
INSERT INTO part VALUES ('p4', 'Cam', 'red', 12, 'Delhi');
INSERT INTO part VALUES ('p5', 'Log', 'blue', 12, 'Indore');

SELECT * FROM part;