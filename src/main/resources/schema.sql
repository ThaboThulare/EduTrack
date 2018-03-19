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
    subject_name varchar(32) not null,
);

create table mark(
      id integer auto_increment not null primary key,
      subject_id integer not null,
      marks double ,
      constraint subject_id_fk foreign key( subject_id) references subject (id)  
);

create table student( 
         student_id integer auto_increment not null primary key, 
        mark_id integer not null,
	 firstname varchar(45) not null,   
	 surname varchar(45) not null, 
         dob date not null,
         gender varchar(45) not null,
         zip integer not null,
         citizenship varchar(45) not null,
         id_number BigInt(13) not null,
--      Not Compulsary
	 username varchar(45), 
         password varchar(45), 
         cellphone integer(10),
         constraint student_id_fk foreign key( mark_id) references mark (id)
);

create table grade( 
        grade_id integer auto_increment not null primary key, 
	grade_year varchar(45) not null, 
	grade varchar(45) not null,
        student_id integer not null,
        constraint grade_id_fk foreign key(student_id) references student(student_id) 
);

create table school( 
        school_id integer auto_increment not null primary key, 
        emis_number integer not null,
	school_name varchar(45) not null, 
	province varchar(45) not null,
        district varchar(45) not null,
        region varchar(45) not null
);