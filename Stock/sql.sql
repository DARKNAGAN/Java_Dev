Cours de base de données 
1. Les requetes select 
Soit la base de données suivante Stock avec la seule table produit. 
_________________________________________
Create database stock;
use stock; 
create table produit (
	reference varchar(50) not null, 
	designation varchar (50), 
	prix float (5.2),
	qte int (5),
	categorie varchar(50),
	primary key(reference)
	);
___________________________________________
insert into produit values ("001", "lait", 1.20, 3, "alimentaire"),
	("002", "sucre", 0.90, 10, "alimentaire"),
	("003", "savon", 2.20, 5, "beauté"),
	("004", "pelle", 6.20, 2, "jardinage");
Question 
Afficher tous les produits :
	Select * from produit; 
	
Select * from produit where categorie = "alimentaire";

Afficher la référence, désignation, et quantité des 
produits ayant un prix supérieur à 1 €. 

select reference, designation, qte 
from produit
where prix > 1;

Select reference, designation from produit where qte <= 2;

Select * from produit 
where prix < 1 and categorie = "alimentaire";




