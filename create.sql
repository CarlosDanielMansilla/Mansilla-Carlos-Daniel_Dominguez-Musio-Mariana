DROP TABLE IF EXISTS ODONTOLOGOS;
CREATE TABLE ODONTOLOGOS (ID INT AUTO_INCREMENT PRIMARY KEY, NumeroMatricula INT NOT NULL, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL);

-- para test --
INSERT INTO ODONTOLOGOS(NumeroMatricula, Nombre, Apellido) VALUES (245, 'Carlos', 'Mansilla'), (427, 'Mariana', 'Dominguez');
