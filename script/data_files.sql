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
	insert into actions (id,designation,point) values
	('rb','Rebond',0),
	('pd','Passe Decisive',0),
	('tr','Tir',2),
	('3p','3 points',3),
	('lf','Lancer franc',1);
	--equipe_saison
	insert into equipesaison (joueur_id,equipe_id,saison_id,numerojoueur) values
	(7,1,1,12),
	(8,1,1,50),
	(9,1,1,22),
	(10,2,1,15),
	(11,2,1,11),
	(12,2,1,00),
	(13,3,1,01),
	(14,3,1,44),
	(15,3,1,89);
	--matchs
	insert into matchs (saison_id,equipe_id1,equipe_id2,datematch) values
	(1,1,2,'2023-10-24'),
	(1,1,3,'2023-10-25'),
	(1,2,3,'2023-10-25');
	--statistiques
	insert into statistique (match_id,joueur_id,action_id) values 
	(1,7,'rb'),
	(1,7,'3p'),
	(1,8,'tr'),
	(1,8,'3p'),
	(1,9,'pd'),
	(1,9,'rb'),
	(1,10,'3p'),
	(1,10,'pd'),
	(1,11,'tr'),
	(1,11,'lf'),
	(1,12,'lf'),
	(1,12,'3p');
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	