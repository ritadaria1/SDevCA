# --- Sample dataset

# --- !Ups

delete from projects;
delete from department;


insert into department (id,name) values ( 1,'Art' );

insert into department (id,name) values ( 2,'Planning' );

insert into department (id,name) values ( 3,'Functionality' );

insert into department (id,name) values ( 4,'Testing' );

insert into department (id,name) values ( 5,'Mobile Phone Game Apps' );



insert into projects (id,department_id,name,description,start_date) values ( 1,4,'Ming Shen','Test the login function','18/12/2018' );

insert into projects (id,department_id,name,description,start_date) values ( 2,4,'Kelly Smith','Update projects','16/04/2018' );

insert into projects (id,department_id,name,description,start_date) values ( 3,1,'John Brown','Create a new theme','09/06/2017' );

insert into projects (id,department_id,name,description,start_date) values ( 4,2,'Mark Miller','New competition','26/08/2018' );

insert into projects (id,department_id,name,description,start_date) values ( 5,2,'Alex Johnson','New action game','02/07/2017' );

insert into projects (id,department_id,name,description,start_date) values ( 6,3,'Amy Williams','Create new hunter character','30/03/2018' );

insert into projects (id,department_id,name,description,start_date) values ( 7,5,'Lee Davis','Add two small features in Hunter Warriors','24/01/2019' );

insert into projects (id,department_id,name,description,start_date) values ( 8,4,'Byran Wilson','Test the Rating','12/02/2019' );

insert into projects (id,department_id,name,description,start_date) values ( 9,1,'Sarah Allen','Design a new outfit for character 10 in "Battle" game','26/04/2018' );

insert into projects (id,department_id,name,description,start_date) values ( 10,3,'Kevin Howard','New weapon','14/09/2017' );

insert into projects (id,department_id,name,description,start_date) values ( 11,3,'David Butler','New map','09/02/2018' );

insert into projects (id,department_id,name,description,start_date) values ( 12,3,'Leo Nelson','New spell','20/02/2019' );
