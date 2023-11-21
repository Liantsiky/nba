--donnees de test 
	--joueur
	insert into joueur (nomprenom) values
	('Zach LaVine'),
	('Lonzo Ball'),
	('Alex Caruso'),
	('Banton Dalano'),
	('Kornet Luke'),
	('Horford Al'),
	('Trae Young'),
	('Dejounte Murray'),
	('Jailen Johnson');
	--equipe
	insert into equipe (nomequipe) values
	('Chicago Bulls'),
	('Boston Celtics'),
	('Atlanta Hawks');
	--saison
	insert into saison (edition,anneedebut,anneefin) values
	(74,2023,2024);
	--action
	insert into actions (id_actions,designation,point) values
	('rb','Rebond',0),
	('pd','Passe Decisive',0),
	('tr','Tir',2),
	('3p','3 points',3),
	('lf','Lancer franc',1);
	--equipe_saison
	insert into equipesaison (id_joueur,id_equipe,id_saison,numerojoueur) values
	(1,1,1,12),
	(2,1,1,50),
	(3,1,1,22),
	(4,2,1,15),
	(5,2,1,11),
	(6,2,1,00),
	(7,3,1,01),
	(8,3,1,44),
	(9,3,1,89);
	--matchs
	insert into matchs (id_saison,id_equipe1,id_equipe2,datematch) values
	(1,1,2,'2023-10-24'),
	(1,1,3,'2023-10-25'),
	(1,2,3,'2023-10-25');
	--statistiques
	insert into statistique (id_matchs,id_joueur,id_actions) values 
	(1,1,'rb'),
	(1,1,'3p'),
	(1,2,'tr'),
	(1,2,'3p'),
	(1,3,'pd'),
	(1,3,'rb'),
	(1,4,'3p'),
	(1,4,'pd'),
	(1,5,'tr'),
	(1,5,'lf'),
	(1,6,'lf'),
	(1,6,'3p');
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	