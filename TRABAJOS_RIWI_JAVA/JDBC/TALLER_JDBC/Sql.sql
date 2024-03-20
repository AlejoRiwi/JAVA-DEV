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