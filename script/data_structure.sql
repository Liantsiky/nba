create database nba

--table
	--joueur
	create table joueur (
		id_joueur serial primary key,
		nomprenom varchar(50)
	);
	--equipe
	create table equipe (
		id_equipe  serial primary key,
		nomequipe varchar(15)
	);
	--saison
	create table saison (
		id_saison serial primary key,
		edition int,
		anneedebut int,
		anneefin int
	);
	--action
	create table actions (
		id_actions varchar(10) primary key,
		designation varchar(20),
		point int
	);

	--equipe_saison
	create table equipesaison (
		id_equipesaison serial primary key,
		id_joueur int,
		id_equipe int,
		id_saison int,
		numerojoueur int,
		foreign key (id_joueur) references joueur(id_joueur),
		foreign key (id_equipe) references equipe(id_equipe),
		foreign key (id_saison) references saison(id_saison)
	);
	--matchs
	create table matchs (
		id_matchs serial primary key,
		id_saison int,
		id_equipe1 int,
		id_equipe2 int,
		datematch date,
		foreign key (id_equipe1) references equipe(id_equipe),
		foreign key (id_equipe2) references equipe(id_equipe),
		foreign key (id_saison) references saison(id_saison)
	);
	--statistiques
	create table statistique (
		id_statistique serial primary key,
		id_matchs int,
		id_joueur int,
		id_actions varchar(10),
		foreign key (id_joueur) references joueur(id_joueur),
		foreign key (id_matchs) references matchs(id_matchs),
		foreign key (id_actions) references actions(id_actions)
	);
	

	
	
	
	
	
	
	
	