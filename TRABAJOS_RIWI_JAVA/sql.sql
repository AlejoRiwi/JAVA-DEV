create database _hospital;

use _hospital;

create table especialidad (
	id int auto_increment primary key,
    nombre varchar (40) not null,
    descripcion varchar (100) not null
);

create table medico (
	id int auto_increment primary key,
    nombre varchar (40) not null,
    apellido varchar (40) not null,
    id_especialidad int,
    constraint fk_especialidad foreign key (id_especialidad) 
		references especialidad (id)
);

create table paciente (
	id int auto_increment primary key,
    nombre varchar (40) not null,
    apellido varchar (40) not null,
    fecha_nacimiento date not null,
    d_identidad varchar(11) not null
);

create table cita (
	id int auto_increment primary key,
    id_paciente int,
    id_medico int,
    constraint fk_paciente foreign key (id_paciente) 
		references paciente (id),
	constraint fk_medico foreign key (id_medico) 
		references medico (id),
	fecha_cita date not null,
    hora_cita time not null,
    motivo varchar (50) not null
);

Insert into especialidad(nombre,descripcion) value (?,?);