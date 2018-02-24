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