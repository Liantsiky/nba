create database nba

--table
	--joueur
	create table joueur (
		id serial primary key,
		nomprenom varchar(50)
	);
	--equipe
	create table equipe (
		id  serial primary key,
		nomequipe varchar(15)
	);
	--saison
	create table saison (
		id serial primary key,
		edition int,
		anneedebut int,
		anneefin int
	);
	--action
	create table actions (
		id serial primary key,
		designation varchar(20),
		point int
	);
	--equipe_saison
	create table equipesaison (
		id serial primary key,
		joueur_id int,
		equipe_id int,
		saison_id int,
		numerojoueur int
		foreign key (joueur_id) references joueur(id),
		foreign key (equipe_id) references equipe(id),
		foreign key (saison_id) references saison(id)
	);
	create table matchs (
		id serial primary key,
		saison_id int,
		equipe_id1 int,
		equipe_id2 int,
		datematch date
		foreign key (equipe_id1) references equipe(id),
		foreign key (equipe_id2) references equipe(id),
		foreign key (saison_id) references saison(id)
	);
	create table statistique (
		id serial primary key,
		match_id int,
		joueur_id int,
		action_id int,
		foreign key (joueur_id) references joueur(id),
		foreign key (match_id) references matchs(id),
		foreign key (action_id) references actions(id),
	)
	

	
	
	
	
	
	
	
	