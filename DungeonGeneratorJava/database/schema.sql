begin transaction;

drop table if exists users;
drop table if exists users_npcs;
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
    made_admin_request boolean,
    CONSTRAINT PK_user PRIMARY KEY (user_id)
);


create table npcs (
    npc_id serial primary key,
    user_id int foreign key references users(user_id),
    appearance int,
    high_ability int,
    low_ability int,
    talents int,
    mannerisms int,
    interaction_traits int,
    ideals int,
    bonds int,
    flaws int
);