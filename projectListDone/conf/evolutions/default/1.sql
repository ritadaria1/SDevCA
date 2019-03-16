# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_employee primary key (id)
);

create table projects (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  department_id                 bigint,
  description                   varchar(255),
  start_date                    varchar(255),
  constraint pk_projects primary key (id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table projects add constraint fk_projects_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_projects_department_id on projects (department_id);


# --- !Downs

alter table projects drop constraint if exists fk_projects_department_id;
drop index if exists ix_projects_department_id;

drop table if exists department;

drop table if exists employee;

drop table if exists projects;

drop table if exists user;

