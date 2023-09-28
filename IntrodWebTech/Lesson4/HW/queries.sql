
-- create
CREATE TABLE Classmates (
  Id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  age INTEGER NOT NULL,
  address TEXT NOT NULL
);

-- insert
INSERT INTO Classmates VALUES (1, 'Lema', 21, 'Новосибирск');
INSERT INTO Classmates VALUES (2, 'Dave', 23, 'Москва');
INSERT INTO Classmates VALUES (3, 'Ava', 18, 'Москва');
INSERT INTO Classmates VALUES (4, 'Алиса', 18, 'Москва');
INSERT INTO Classmates VALUES (5, 'Алиса', 18, 'Новосибирск');
INSERT INTO Classmates VALUES (6, 'Петр', 18, 'Санкт-Петербург');
INSERT INTO Classmates VALUES (7, 'Екатерина', 18, 'Санкт-Петербург');
INSERT INTO Classmates VALUES (8, 'Мадина', 18, 'Петропавловск');
INSERT INTO Classmates VALUES (9, 'Константин', 23, 'Новосибирск');

-- fetch 
SELECT name Имя, age Возраст FROM Classmates where id > 2 order by age desc;
