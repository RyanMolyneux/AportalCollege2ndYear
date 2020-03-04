# --- Sample dataset

# --- !Ups

insert into category (id,name) values ( 1,'Figurine' );
insert into category (id,name) values ( 2,'Manga' );
insert into category (id,name) values ( 3,'Posters' );



insert into user (email,name,password,role) values ( 'admin@products.com', 'Alice Admin', 'password', 'admin' );

insert into genre (genre_id, genre) values (1, 'Fantasy');
insert into genre (genre_id, genre) values (2, 'Fighting');
insert into genre (genre_id, genre) values (3, 'Fiction');
insert into genre (genre_id, genre) values (4, 'Adventure');
insert into genre (genre_id, genre) values (5, 'Comedy');
insert into genre (genre_id, genre) values (6, 'School');

insert into querytype(query_type_id,query_type_name) values(1,'General Issues');
insert into querytype(query_type_id,query_type_name) values(2,'Forum Issue');
insert into querytype(query_type_id,query_type_name) values(3,'Product Order Issue');
insert into querytype(query_type_id,query_type_name) values(4,'Other');

