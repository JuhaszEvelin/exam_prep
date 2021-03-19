DROP TABLE IF EXISTS house_points;

CREATE TABLE house_points (
house_name VARCHAR,
student_name VARCHAR,
points_eraned INT
);

INSERT INTO house_points (house_name, student_name, points_earned)
VALUES
('Gryffindor', 'Harry Potter', 50),
('Slytherin', 'Draco Malfoy', 10),
('Slytherin', 'Draco Malfoy', 20),
('Gryffindor', 'Harry Potter', -15),
('Hufflepuff', 'Cedric Diggory', 25),
('Gryffindor', 'Harry Potter', 50);

