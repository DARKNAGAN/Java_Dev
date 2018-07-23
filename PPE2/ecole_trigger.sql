Créer la base données Ecole :

Créer les tables suivantes :

	Classe (idclasse, libelle, salle, nbEleves)
	Eleve (ideleve, civilite, nom, prenom, idclasse#)


Create database Ecole;
Use Ecole;
Create table Classe(
	idclasse int (3) NOT NULL AUTO_INCREMENT,
	libelle varchar (10),
	salle varchar (15),
	nbEleves int(3), 
	primary key(idclasse)
);	

Create table Eleve(
	ideleve int (3) NOT NULL AUTO_INCREMENT,
	civilite varchar(30),
	nom varchar(30),
	prenom varchar(30),
	idclasse int(3) NOT NULL,
	primary key (ideleve),
	foreign key (idclasse) references Classe (idclasse)
);
	
insert into Classe values 
		(null, "SIO SLAM 2", "salle 2", 0),
		(null, "SIO SISR 2", "salle 3", 1);
		
insert into Eleve values
	(null, "Monsieur", "Mozar", "Kevin", 2);
insert into Eleve values
	(null, "Madame", "Marie", "Ellen", 1);
	
Afficher les triggers 
 show triggers ;
 
Rappel : 6 triggers 
	Action : avant before, apres after 
	Requete : update, delete, insert 
	Ancien enregistrement: old 
	Nouveau enregistrement: new
	Old: quand il y a delete, update
	New: quand il y a insert, update 
Créer un trigger qui permet d incrementer le nb eleves de la classe
à chaque insertion d un eleve 

delimiter |
create trigger After_insert_Eleve
After insert on Eleve
For each row
Begin
	Update classe
	Set nbEleves = nbEleves + 1
	where idclasse = new.idclasse;
End |
delimiter ;
	
insert into Eleve values
	(null, "Madame", "Marie", "Ellen", 1);
	
Supprimer un trigger 
Drop trigger 	After_insert_Eleve ;

Créer un trigger qui permet de décrémenter le nombre d eleves 
à chaque suppression d un eleve de la classe.

delimiter |
create trigger Alter_delete_Eleve
After delete on Eleve
For each row
Begin
	update classe
	Set nbEleves = nbEleves -1
	where idclasse = old.idclasse;
	
end |
delimiter ;


delete from Eleve where ideleve=1;
-- cree un trigger pour changer un eleve d'une classe à une autre 

delimiter |
create trigger After_Update_Eleve
After update on Eleve
For each row 
Begin
	update classe
	Set nbEleves = nbEleves -1
	where idclasse = old.idclasse;
	update classe
	Set nbEleves = nbEleves +1
	where idclasse = new.idclasse;
End |
delimiter ;

update eleve set idclasse=2 where ideleve = 2;

ecrire un trigger qui permet a chaque suppresion dun eleve de stocker 
dans une table a creer ancieneleve avec les memes champs aux quels on 
ajoute la date de la suppresion.

create table ancienEleve(
	idEleve int(3) NOT NULL AUTO_INCREMENT,
	civilite varchar(30),
	nom varchar(30),
	prenom varchar(30),
	dateDepart date,
	PRIMARY KEY (idEleve)
	);
	
delimiter |
create trigger After_Delete_Eleve
After delete on Eleve
For each row
Begin
	insert into ancienEleve values(
		null,
		old.civilite,
		old.nom,
		old.prenom,
		now()
		);
end |
delimiter ;

Trigger qui controle les donnees avant insertion. 

Syntaxe :
Alternative 
	if condition then 
		instruction SQL
	end ; 
	if condition then 
		instruction SQL
	else 
		instruction SQL
	end;
	
Affectation 
	Set champ = valeur ;
Declaration 
	Declare variable type ;
	Declare variable type default valeur;

	Exo : ecrire un trigger qui verifie avant insertion que si la civilite 
	n est pas Mr ou Mme, par defaut elle sera egal à Mr.


delimiter |
create trigger Before_Insert_Eleve
Before insert on Eleve
For each row

Begin
	if (new.civilite <> 'Mr' and new.civilite <> 'Mme') then 
		set new.civilite = 'Mr';
	end if;
end |

delimiter ;

ajouter le champ age dans la table eleve. 
Mettez ce champ a zero pour tous les eleves 
modifier le trigger qui verifie que si à l insertion le champ age est negatif
on insere la valeur 0. 

ALTER TABLE Eleve ADD age int(3);

update eleve set age = 0;

delimiter |
create trigger Before_Insert_Eleve
Before insert on Eleve
For each row

Begin
	if (new.civilite <> 'Mr' and new.civilite <> 'Mme') then 
		set new.civilite = 'Mr';
	end if;
	if (new.age < 0) then
		set new.age = 0;
	end if;
end |

delimiter ;

