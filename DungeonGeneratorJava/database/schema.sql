begin transaction;

drop table if exists users;
drop table if exists npcs;
drop table if exists appearances;
drop table if exists high_abilities;
drop table if exists low_abilities;
drop table if exists talents;
drop table if exists mannerisms;
drop table if exists interaction_traits;
drop table if exists ideals;
drop table if exists bonds;
drop table if exists flaws;

create table users (--general user has ability to save npcs. admin can add traits to different tables
    user_id SERIAL,
    username varchar(50) NOT NULL UNIQUE,
    password_hash varchar(200) NOT NULL,
    role varchar(50) NOT NULL,
    CONSTRAINT PK_user PRIMARY KEY (user_id)
);


create table npcs (
    npc_id serial primary key,
    user_id int foreign key references users(user_id),
    appearance int, --all ints here refer to corresponding id columns
    high_ability int,
    low_ability int,
    talents int,
    mannerisms int,
    interaction_traits int,
    ideals int,
    bonds int,
    flaws int
);

create table appearances (
    appearance_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table high_abilities (
    high_abilities_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table low_abilities (
    low_abilities_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table talents (
    talents_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table mannerisms (
    mannerisms_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table interaction_traits (
    interaction_traits_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table ideals (
    ideals_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table bonds (
    bonds_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

create table flaws (
    flaws_id serial primary key,
    description varchar(500) not null,
    rarity varchar(20) not null --acceptable inputs are "common", "uncommon", "rare/exotic"
);

commit transaction;