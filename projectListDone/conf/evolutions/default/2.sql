# --- Sample dataset

# --- !Ups

delete from projects;
delete from department;


insert into department (id,name) values ( 1,'Art' );

insert into department (id,name) values ( 2,'Planning' );

insert into department (id,name) values ( 3,'Functionality' );

insert into department (id,name) values ( 4,'Testing' );

insert into department (id,name) values ( 5,'Mobile Phone Game Apps' );



insert into projects (id,department_id,name,description,start_date) values ( 1,4,'Ming Shen','Test the login function', '2019-03-14' );

insert into projects (id,department_id,name,description,start_date) values ( 2,4,'Kelly Smith','Update projects', '2018-05-14' );

insert into projects (id,department_id,name,description,start_date) values ( 3,1,'John Brown','Create a new theme', '2018-10-25' );

insert into projects (id,department_id,name,description,start_date) values ( 4,2,'Mark Miller','New competition', '2019-01-30' );

insert into projects (id,department_id,name,description,start_date) values ( 5,2,'Alex Johnson','New action game', '2019-03-01' );

insert into projects (id,department_id,name,description,start_date) values ( 6,3,'Amy Williams','Create new hunter character', '2018-11-19' );

insert into projects (id,department_id,name,description,start_date) values ( 7,5,'Lee Davis','Add two small features in Hunter Warriors', '2019-01-23' );

insert into projects (id,department_id,name,description,start_date) values ( 8,4,'Byran Wilson','Test the Rating', '2018-04-06' );

insert into projects (id,department_id,name,description,start_date) values ( 9,1,'Sarah Allen','Design a new outfit for character 10 in "Battle" game', '2018-06-24' );

insert into projects (id,department_id,name,description,start_date) values ( 10,3,'Kevin Howard','New weapon', '2018-08-16' );

insert into projects (id,department_id,name,description,start_date) values ( 11,3,'David Butler','New map', '2017-12-01' );

insert into projects (id,department_id,name,description,start_date) values ( 12,3,'Leo Nelson','New spell', '2017-07-05' );
