drop database if exists PPE2;
create database PPE2;
use PPE2;

create table Profil (
	idprofil int (3) not null auto_increment,
	nom varchar (50),
	prenom varchar (50),
	adresse varchar (100),
	mail varchar (100),
	mdp varchar (50),
	droits varchar (50),
	primary key (idprofil)
);

insert into Profil values
(null, "admin Nom", "admin Prenom", "rue de Paris", "admin@gmail.com", "123", "tout"), 
(null, "user Nom", "user Prenom", "rue de Lyon", "user@gmail.com", "123", "0-0-1");

create table  client (

	idclient int(5) not null auto_increment,
	nom varchar(50),
	prenom varchar(50),
	email varchar(50),
	adresse varchar(50),
	primary key (idclient)
);

insert into client values ("","ben", "oka","oka@gmail.com","rue de paris, limoges"),
("","Edwina", "serine","ed@gmail.com","rue de lyon, paris"),
("","kamar", "elie","kamar@gmail.com","rue de lille, Lyon");


