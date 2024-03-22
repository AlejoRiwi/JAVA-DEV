create database book;

use book;

create table autores (
	id int auto_increment primary key, 
    name varchar (40) not null, 
    country varchar(40) not null
);

CREATE TABLE libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(40) NOT NULL,
    age DATE NOT NULL,
    price DOUBLE NOT NULL,
    id_autor INT,
    CONSTRAINT fk_id_autores FOREIGN KEY (id_autor)
        REFERENCES autores (id)
);


SELECT * FROM autores WHERE id = 32;

INSERT INTO autores (name, country) VALUES
('Gabriel García Márquez', 'Colombiana'),
('Mario Vargas Llosa', 'Peruana'),
('Julio Cortázar', 'Argentino'),
('Jorge Luis Borges', 'Argentino'),
('Pablo Neruda', 'Chileno'),
('Isabel Allende', 'Chilena'),
('Carlos Fuentes', 'Mexicano'),
('Octavio Paz', 'Mexicano'),
('Miguel de Cervantes', 'Español'),
('Federico García Lorca', 'Español'),
('Jorge Amado', 'Brasileño'),
('Clarice Lispector', 'Brasileña'),
('José Saramago', 'Portugués'),
('Fernando Pessoa', 'Portugués'),
('Gustavo Adolfo Bécquer', 'Español'),
('Antonio Machado', 'Español'),
('Rubén Darío', 'Nicaragüense'),
('Horacio Quiroga', 'Uruguayo'),
('Juan Rulfo', 'Mexicano'),
('Alfonsina Storni', 'Argentino'),
('Pablo de Rokha', 'Chileno'),
('José Martí', 'Cubano'),
('César Vallejo', 'Peruano'),
('Mariano Azuela', 'Mexicano'),
('Rosario Castellanos', 'Mexicano'),
('Javier Marías', 'Español'),
('Manuel Puig', 'Argentino'),
('Camilo José Cela', 'Español'),
('Juan Carlos Onetti', 'Uruguayo'),
('Leopoldo Marechal', 'Argentino');

SELECT * FROM autores;

SELECT * FROM autores ORDER BY autores.id ASC;

INSERT INTO books (title, age, price, id_author) VALUES
('Ciudad de hueso', '2007-01-01', 18.99, 31),
('Ciudad de ceniza', '2008-01-01', 19.99, 31),
('Ciudad de cristal', '2009-01-01', 20.99, 31),
('Ciudad de los ángeles caídos', '2011-01-01', 21.99, 31),
('Ciudad de las almas perdidas', '2012-01-01', 22.99, 31),
('Ciudad del fuego celestial', '2014-01-01', 23.99, 31),
('Lady Midnight', '2016-01-01', 24.99, 31),
('Lord of Shadows', '2017-01-01', 25.99, 31),
('Queen of Air and Darkness', '2018-01-01', 26.99, 31);