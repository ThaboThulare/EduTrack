/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  THABO64
 * Created: Feb 12, 2018
 */



---example 
create table subject (
    id integer auto_increment not null primary key,
    subject_name varchar(32) not null
);

create table mark(
      id integer auto_increment not null primary key,
      subject_id integer not null,
      marks double ,
      constraint subject_id_fk foreign key( subject_id) references subject (id)  
);

create table student( 
         student_id integer auto_increment not null primary key, 
	 firstname varchar(45) not null,   
	 lastname varchar(45) not null, 
	 username varchar(45) not null, 
         password varchar(45) not null, 
         cellphone integer(10)
);

create table grade( 
        grade_id integer auto_increment not null primary key, 
	grade_year varchar(45) not null, 
	grade varchar(45) not null,
        student_id integer not null,
        constraint grade_id_fk foreign key(student_id) references student(student_id) 
);