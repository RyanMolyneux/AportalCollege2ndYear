# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table advert (
  advert_id                     bigint not null,
  advert_name                   varchar(60),
  advert_date_added             timestamp,
  advert_admin_email            varchar(255),
  constraint pk_advert primary key (advert_id)
);
create sequence Advert_seq;

create table basket (
  id                            bigint not null,
  customer_email                varchar(255),
  constraint uq_basket_customer_email unique (customer_email),
  constraint pk_basket primary key (id)
);
create sequence basket_seq;

create table category (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);
create sequence category_seq;

create table category_product (
  category_id                   bigint not null,
  product_id                    bigint not null,
  constraint pk_category_product primary key (category_id,product_id)
);

create table chat (
  chat_id                       bigint not null,
  chat_name                     varchar(255),
  constraint pk_chat primary key (chat_id)
);
create sequence Chat_seq;

create table chat_user (
  chat_chat_id                  bigint not null,
  user_email                    varchar(255) not null,
  constraint pk_chat_user primary key (chat_chat_id,user_email)
);

create table friendlist (
  friend_list_id                bigint not null,
  friend_list_name              varchar(255),
  friend_status                 varchar(255),
  customer_email                varchar(255),
  constraint pk_friendlist primary key (friend_list_id)
);
create sequence FriendList_seq;

create table genre (
  genre_id                      bigint not null,
  genre                         varchar(255),
  constraint pk_genre primary key (genre_id)
);
create sequence genre_seq;

create table genre_media (
  genre_genre_id                bigint not null,
  media_media_id                bigint not null,
  constraint pk_genre_media primary key (genre_genre_id,media_media_id)
);

create table media (
  media_id                      bigint not null,
  title                         varchar(255),
  media_description             varchar(1000),
  media_rating                  bigint,
  anime_url                     varchar(255),
  manga_url                     varchar(255),
  constraint pk_media primary key (media_id)
);
create sequence media_seq;

create table message (
  message_id                    bigint not null,
  message_desc                  TEXT(20000),
  message_time                  timestamp,
  chat_chat_id                  bigint,
  customer_email                varchar(255),
  constraint pk_message primary key (message_id)
);
create sequence Message_seq;

create table order_item (
  id                            bigint not null,
  quantity                      integer,
  price                         double,
  order_id                      bigint,
  basket_id                     bigint,
  product_id                    bigint,
  constraint pk_order_item primary key (id)
);
create sequence order_item_seq;

create table post (
  id                            bigint not null,
  post_description              TEXT(20000),
  user_email                    varchar(255),
  post_date                     timestamp,
  topic_topic_id                bigint,
  constraint pk_post primary key (id)
);
create sequence post_seq;

create table product (
  id                            bigint not null,
  name                          varchar(255),
  description                   varchar(1000),
  stock                         integer,
  price                         double,
  constraint pk_product primary key (id)
);
create sequence product_seq;

create table querytype (
  query_type_id                 bigint not null,
  query_type_name               varchar(255),
  constraint pk_querytype primary key (query_type_id)
);
create sequence QueryType_seq;

create table shop_order (
  id                            bigint not null,
  order_date                    timestamp,
  customer_email                varchar(255),
  constraint pk_shop_order primary key (id)
);
create sequence shop_order_seq;

create table topic (
  topic_id                      bigint not null,
  name                          TEXT(200),
  description                   TEXT(200),
  user_email                    varchar(255),
  constraint pk_topic primary key (topic_id)
);
create sequence topic_seq;

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(1000),
  constraint pk_user primary key (email)
);

create table support_query (
  query_id                      bigint not null,
  query_type_query_type_id      bigint,
  query_description             varchar(2000),
  querying_customer_email       varchar(255),
  query_date                    timestamp,
  query_status                  boolean,
  constraint pk_support_query primary key (query_id)
);
create sequence support_query_seq;

alter table advert add constraint fk_advert_advert_admin_email foreign key (advert_admin_email) references user (email) on delete restrict on update restrict;
create index ix_advert_advert_admin_email on advert (advert_admin_email);

alter table basket add constraint fk_basket_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;

alter table category_product add constraint fk_category_product_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_product_category on category_product (category_id);

alter table category_product add constraint fk_category_product_product foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_category_product_product on category_product (product_id);

alter table chat_user add constraint fk_chat_user_chat foreign key (chat_chat_id) references chat (chat_id) on delete restrict on update restrict;
create index ix_chat_user_chat on chat_user (chat_chat_id);

alter table chat_user add constraint fk_chat_user_user foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_chat_user_user on chat_user (user_email);

alter table friendlist add constraint fk_friendlist_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_friendlist_customer_email on friendlist (customer_email);

alter table genre_media add constraint fk_genre_media_genre foreign key (genre_genre_id) references genre (genre_id) on delete restrict on update restrict;
create index ix_genre_media_genre on genre_media (genre_genre_id);

alter table genre_media add constraint fk_genre_media_media foreign key (media_media_id) references media (media_id) on delete restrict on update restrict;
create index ix_genre_media_media on genre_media (media_media_id);

alter table message add constraint fk_message_chat_chat_id foreign key (chat_chat_id) references chat (chat_id) on delete restrict on update restrict;
create index ix_message_chat_chat_id on message (chat_chat_id);

alter table message add constraint fk_message_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_message_customer_email on message (customer_email);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);

alter table post add constraint fk_post_user_email foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_post_user_email on post (user_email);

alter table post add constraint fk_post_topic_topic_id foreign key (topic_topic_id) references topic (topic_id) on delete restrict on update restrict;
create index ix_post_topic_topic_id on post (topic_topic_id);

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);

alter table topic add constraint fk_topic_user_email foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_topic_user_email on topic (user_email);

alter table support_query add constraint fk_support_query_query_type_query_type_id foreign key (query_type_query_type_id) references querytype (query_type_id) on delete restrict on update restrict;
create index ix_support_query_query_type_query_type_id on support_query (query_type_query_type_id);

alter table support_query add constraint fk_support_query_querying_customer_email foreign key (querying_customer_email) references user (email) on delete restrict on update restrict;
create index ix_support_query_querying_customer_email on support_query (querying_customer_email);


# --- !Downs

alter table advert drop constraint if exists fk_advert_advert_admin_email;
drop index if exists ix_advert_advert_admin_email;

alter table basket drop constraint if exists fk_basket_customer_email;

alter table category_product drop constraint if exists fk_category_product_category;
drop index if exists ix_category_product_category;

alter table category_product drop constraint if exists fk_category_product_product;
drop index if exists ix_category_product_product;

alter table chat_user drop constraint if exists fk_chat_user_chat;
drop index if exists ix_chat_user_chat;

alter table chat_user drop constraint if exists fk_chat_user_user;
drop index if exists ix_chat_user_user;

alter table friendlist drop constraint if exists fk_friendlist_customer_email;
drop index if exists ix_friendlist_customer_email;

alter table genre_media drop constraint if exists fk_genre_media_genre;
drop index if exists ix_genre_media_genre;

alter table genre_media drop constraint if exists fk_genre_media_media;
drop index if exists ix_genre_media_media;

alter table message drop constraint if exists fk_message_chat_chat_id;
drop index if exists ix_message_chat_chat_id;

alter table message drop constraint if exists fk_message_customer_email;
drop index if exists ix_message_customer_email;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

alter table post drop constraint if exists fk_post_user_email;
drop index if exists ix_post_user_email;

alter table post drop constraint if exists fk_post_topic_topic_id;
drop index if exists ix_post_topic_topic_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

alter table topic drop constraint if exists fk_topic_user_email;
drop index if exists ix_topic_user_email;

alter table support_query drop constraint if exists fk_support_query_query_type_query_type_id;
drop index if exists ix_support_query_query_type_query_type_id;

alter table support_query drop constraint if exists fk_support_query_querying_customer_email;
drop index if exists ix_support_query_querying_customer_email;

drop table if exists advert;
drop sequence if exists Advert_seq;

drop table if exists basket;
drop sequence if exists basket_seq;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists category_product;

drop table if exists chat;
drop sequence if exists Chat_seq;

drop table if exists chat_user;

drop table if exists friendlist;
drop sequence if exists FriendList_seq;

drop table if exists genre;
drop sequence if exists genre_seq;

drop table if exists genre_media;

drop table if exists media;
drop sequence if exists media_seq;

drop table if exists message;
drop sequence if exists Message_seq;

drop table if exists order_item;
drop sequence if exists order_item_seq;

drop table if exists post;
drop sequence if exists post_seq;

drop table if exists product;
drop sequence if exists product_seq;

drop table if exists querytype;
drop sequence if exists QueryType_seq;

drop table if exists shop_order;
drop sequence if exists shop_order_seq;

drop table if exists topic;
drop sequence if exists topic_seq;

drop table if exists user;

drop table if exists support_query;
drop sequence if exists support_query_seq;

