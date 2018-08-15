#Create games table
CREATE TABLE nsprices_dev.games (
    id int not null auto_increment,
    na_nsuid int not null,
    jp_nsuid int not null,
    eu_nsuid int not null,
    na_title varchar(255),
    jp_title varchar(255),
    eu_title varchar(255),
    rel_date date,
    lang varchar(255),
    publisher varchar(255),
    img_url varchar(255),
    score int,
    category varchar(255),
    is_dig boolean,
    player_num int,
    multiplayer boolean,
    tv_mode boolean,
    hand_mode boolean,
    PRIMARY KEY(id)
);

#Create price table for every game
create table nsprices_dev.prices (
	id int not null auto_increment,
    game_id int,
    us_p float,
    mx_p float,
    ca_p float,
    jp_p float,
    au_p float,
    nz_p float,
    gb_p float,
    steam_p float,
    ps4_p float,
    xbox_p float,
    gog_p float,
    PRIMARY KEY(id),
    FOREIGN KEY(game_id)
		References games(id)
);